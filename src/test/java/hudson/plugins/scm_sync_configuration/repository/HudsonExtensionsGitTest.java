package hudson.plugins.scm_sync_configuration.repository;

import hudson.plugins.test.utils.scms.ScmUnderTestGit;
import org.junit.Ignore;

public class HudsonExtensionsGitTest extends HudsonExtensionsTest {

	public HudsonExtensionsGitTest() {
		super(new ScmUnderTestGit());
	}

    @Ignore("Should be re-activated once maven-scm-api 1.9 is released (see JENKINS-15128)")
    public void shouldJobRenameBeCorrectlyImpactedOnSCM() throws Throwable {
        super.shouldJobRenameBeCorrectlyImpactedOnSCM();
    }
}
