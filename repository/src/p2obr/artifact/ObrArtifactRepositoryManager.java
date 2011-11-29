package p2obr.artifact;

import java.net.URI;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRequest;

public class ObrArtifactRepositoryManager implements IArtifactRepositoryManager {

	
	public void addRepository(URI location) {
		// TODO Auto-generated method stub

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

	
	public IQueryResult<IArtifactKey> query(IQuery<IArtifactKey> query,
			IProgressMonitor monitor) {
	    System.out.println("query artifact " + query);
		return null;
	}

	
	public IArtifactRequest createMirrorRequest(IArtifactKey key,
			IArtifactRepository destination,
			Map<String, String> destinationDescriptorProperties,
			Map<String, String> destinationRepositoryProperties) {
		// TODO Auto-generated method stub

	    System.out.println("create mirror artifact request " + key);
		return null;
	}

	
	public IArtifactRepository createRepository(URI location, String name,
			String type, Map<String, String> properties)
			throws ProvisionException {
		// TODO Auto-generated method stub

	    System.out.println("create artifact repository " + location);
		return null;
	}

	
	public IArtifactRepository loadRepository(URI location,
			IProgressMonitor monitor) throws ProvisionException {
		// TODO Auto-generated method stub

	    System.out.println("load artifact repository " + location);
		return null;
	}

	
	public IArtifactRepository loadRepository(URI location, int flags,
			IProgressMonitor monitor) throws ProvisionException {
		// TODO Auto-generated method stub

	    System.out.println("load artifact repository " + location);
		return null;
	}

	
	public IArtifactRepository refreshRepository(URI location,
			IProgressMonitor monitor) throws ProvisionException {

	    System.out.println("refresh artifact repository " + location);
		return null;
	}

}
