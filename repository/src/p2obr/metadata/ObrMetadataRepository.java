package p2obr.metadata;

import java.net.URI;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.repository.IRepositoryReference;
import org.eclipse.equinox.p2.repository.IRunnableWithProgress;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

public class ObrMetadataRepository implements IMetadataRepository {

	
	public URI getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getType() {
		// TODO Auto-generated method stub
		return null;
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

	
	public IQueryResult<IInstallableUnit> query(IQuery<IInstallableUnit> query,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void addInstallableUnits(
			Collection<IInstallableUnit> installableUnits) {
		// TODO Auto-generated method stub
		
	}

	
	public void addReferences(
			Collection<? extends IRepositoryReference> references) {
		// TODO Auto-generated method stub
		
	}

	
	public Collection<IRepositoryReference> getReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean removeInstallableUnits(
			Collection<IInstallableUnit> installableUnits) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}

	
	public IStatus executeBatch(IRunnableWithProgress runnable,
			IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}



}
