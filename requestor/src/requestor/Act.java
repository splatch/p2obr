package requestor;

import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.internal.provisional.p2.director.IDirector;
import org.eclipse.equinox.internal.provisional.p2.director.ProfileChangeRequest;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.engine.IEngine;
import org.eclipse.equinox.p2.engine.IProfile;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.engine.IProvisioningPlan;
import org.eclipse.equinox.p2.engine.ProvisioningContext;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.planner.IPlanner;
import org.eclipse.equinox.p2.planner.IProfileChangeRequest;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Act implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        ServiceReference reference = context.getServiceReference(IProvisioningAgent.class.getName());
        IProvisioningAgent agent = (IProvisioningAgent) context.getService(reference);

        IProfileRegistry registry = (IProfileRegistry) agent.getService("org.eclipse.equinox.p2.engine.IProfileRegistry");

        IEngine service = (IEngine) agent.getService("org.eclipse.equinox.p2.engine.IEngine");
        IProfile profile = registry.getProfile("aaaa");
        ProvisioningContext ctx = new ProvisioningContext(agent);
        URI[] repositories = new URI[] {
            URI.create("http://download.eclipse.org/tools/orbit/downloads/drops/S20110907174232/repository/"),
            URI.create("file:/Users/lukasz/Documents/smx-ide/p2obr/repository/some-repository.xml")
        };

        ctx.setMetadataRepositories(repositories);
        ctx.setArtifactRepositories(repositories);

        IProvisioningPlan plan = service.createPlan(profile, ctx);

        NullProgressMonitor pm = new NullProgressMonitor();

        IQueryable<IInstallableUnit> metadata = ctx.getMetadata(pm);

        IQuery<IInstallableUnit> query = QueryUtil.createIUQuery("org.apache.batik.css");
	IQueryResult<IInstallableUnit> queryResult = metadata.query(query, pm);

	Iterator<IInstallableUnit> iterator = queryResult.iterator();
	while (iterator.hasNext()) {
	    plan.addInstallableUnit(iterator.next());
	}

	// Although we get a sorted list back from the ProvisioningContext above, it 
	// gets unsorted when we convert the queryable into an array so we must re-sort it.
	// See https://bugs.eclipse.org/335153.
	
        IStatus perform = service.perform(plan, new NullProgressMonitor());
        System.out.println(perform.getMessage() + " " + perform.getException());

        IDirector director = (IDirector) agent.getService("org.eclipse.equinox.internal.provisional.p2.director.IDirector");
        IPlanner planner = (IPlanner) agent.getService("org.eclipse.equinox.p2.planner.IPlanner");

        IProfileChangeRequest changeRequest = planner.createChangeRequest(profile);

	iterator = queryResult.iterator();
	while (iterator.hasNext()) {
	    changeRequest.add(iterator.next());
	}


        IStatus provision = director.provision((ProfileChangeRequest) changeRequest, ctx, new NullProgressMonitor());
        System.out.println("Profile change " + provision.getMessage() + " " + Arrays.toString(provision.getChildren()) +"\n\t" + provision.getException());
    }

    public void stop(BundleContext context) throws Exception {
	// TODO Auto-generated method stub

    }

    
}
