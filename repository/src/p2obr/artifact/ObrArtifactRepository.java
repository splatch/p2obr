package p2obr.artifact;

import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.repository.IRunnableWithProgress;
import org.eclipse.equinox.p2.repository.artifact.IArtifactDescriptor;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRequest;

public class ObrArtifactRepository implements IArtifactRepository {

	
	public URI getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getType() {
		return "p2-artifact";
	}

	
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Map<String, String> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IProvisioningAgent getProvisioningAgent() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean isModifiable() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String setProperty(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IQueryResult<IArtifactKey> query(IQuery<IArtifactKey> query,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IArtifactDescriptor createArtifactDescriptor(IArtifactKey key) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IArtifactKey createArtifactKey(String classifier, String id,
			Version version) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void addDescriptor(IArtifactDescriptor descriptor) {
		// TODO Auto-generated method stub

	}

	
	public void addDescriptors(IArtifactDescriptor[] descriptors) {
		// TODO Auto-generated method stub

	}

	
	public boolean contains(IArtifactDescriptor descriptor) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean contains(IArtifactKey key) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public IStatus getArtifact(IArtifactDescriptor descriptor,
			OutputStream destination, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IStatus getRawArtifact(IArtifactDescriptor descriptor,
			OutputStream destination, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IArtifactDescriptor[] getArtifactDescriptors(IArtifactKey key) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IStatus getArtifacts(IArtifactRequest[] requests,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public OutputStream getOutputStream(IArtifactDescriptor descriptor)
			throws ProvisionException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IQueryable<IArtifactDescriptor> descriptorQueryable() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void removeAll() {
		// TODO Auto-generated method stub

	}

	
	public void removeDescriptor(IArtifactDescriptor descriptor) {
		// TODO Auto-generated method stub

	}

	
	public void removeDescriptor(IArtifactKey key) {
		// TODO Auto-generated method stub

	}

	
	public IStatus executeBatch(IRunnableWithProgress runnable,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
