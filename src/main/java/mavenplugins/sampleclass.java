package mavenplugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "version", defaultPhase = LifecyclePhase.INITIALIZE)
public class sampleclass extends AbstractMojo{

    @Parameter(name = "command", defaultValue = "DEFAULT COMMAND MANJUNATH")
    public String command;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("Hello World : " + command);
    }
}
