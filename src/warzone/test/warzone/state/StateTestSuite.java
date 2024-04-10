package warzone.state;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test all test class of package warzone.state
 * @author Khushi
 * @version 1.1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        GamePlayTest.class,
        IssueOrderTest.class,
        MapEditorTest.class,
        ReinforcementTest.class,
        StartupTest.class
})
public class StateTestSuite {

}