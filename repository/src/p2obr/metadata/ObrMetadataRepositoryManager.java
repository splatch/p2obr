package p2obr.metadata;

import java.net.URI;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class ObrMetadataRepositoryManager implements IMetadataRepositoryManager {

	
	public void addRepository(URI location) {
		// TODO Auto-generated method stub


	    System.out.println("add repository " + location);
	}

	
	public boolean contains(URI location) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public IProvisioningAgent getAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public URI[] getKnownRepositories(int flags) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getRepositoryProperty(URI location, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setRepositoryProperty(URI location, String key, String value) {
		// TODO Auto-generated method stub

	}

	
	public boolean isEnabled(URI location) {

	    System.out.println("is enabled? " + location);
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean removeRepository(URI location) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void setEnabled(URI location, boolean enablement) {
		// TODO Auto-generated method stub

	}

	
	public IQueryResult<IInstallableUnit> query(IQuery<IInstallableUnit> query,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	    System.out.println("query " + query);
		return null;
	}

	
	public IMetadataRepository createRepository(URI location, String name,
			String type, Map<String, String> properties)
			throws ProvisionException, OperationCanceledException {
		// TODO Auto-generated method stub
	    
	    System.out.println("create repository " + location);
		return null;
	}

	
	public IMetadataRepository loadRepository(URI location,
			IProgressMonitor monitor) throws ProvisionException,
			OperationCanceledException {
		// TODO Auto-generated method stub
	    System.out.println("load repository " + location);
		return null;
	}

	
	public IMetadataRepository loadRepository(URI location, int flags,
			IProgressMonitor monitor) throws ProvisionException,
			OperationCanceledException {
		// TODO Auto-generated method stub

	    System.out.println("load repository " + location);
		return null;
	}

	
	public IMetadataRepository refreshRepository(URI location,
			IProgressMonitor monitor) throws ProvisionException,
			OperationCanceledException {
		// TODO Auto-generated method stub

	    System.out.println("refresh repository " + location);
		return null;
	}

}
