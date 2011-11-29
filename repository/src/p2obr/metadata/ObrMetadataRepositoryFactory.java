package p2obr.metadata;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;

import org.apache.felix.bundlerepository.Repository;
import org.apache.felix.bundlerepository.RepositoryAdmin;
import org.apache.felix.bundlerepository.Requirement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.spi.MetadataRepositoryFactory;

public class ObrMetadataRepositoryFactory extends MetadataRepositoryFactory {

    @Override
    public IMetadataRepository create(URI location, String name, String type,
	    Map<String, String> properties) throws ProvisionException {
	System.out.println("Create metadata repository " + location + " " + name + " " + type + " " + properties);
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public IMetadataRepository load(URI location, int flags,
	    IProgressMonitor monitor) throws ProvisionException {

	RepositoryAdmin admin = null;
	try {
	    Repository repo = admin.addRepository(location.toURL());
	} catch (MalformedURLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	System.out.println("Load metadata repository " + location);
	return null;
    }

}
