package mavenplugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "versions"/*, defaultPhase = LifecyclePhase.INITIALIZE*/)
public class sampleclass1 extends AbstractMojo{

    @Parameter(name = "command_new", defaultValue = "DEFAULT COMMAND MANJUNATH NEW")
    public String command;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("Hello World : " + command);
    }
}
