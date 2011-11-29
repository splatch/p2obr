package p2obr.artifact;

import java.net.URI;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.spi.ArtifactRepositoryFactory;

public class ObrArtifactRepositoryFactory extends ArtifactRepositoryFactory {

    @Override
    public IArtifactRepository create(URI location, String name, String type,
	    Map<String, String> properties) throws ProvisionException {

	System.out.println("Factory create " + location + " " + name + " " + type + " " + properties);

	return null;
    }

    @Override
    public IArtifactRepository load(URI location, int flags,
	    IProgressMonitor monitor) throws ProvisionException {

	System.out.println("Factory load " + location);
	
	return null;
    }

}
