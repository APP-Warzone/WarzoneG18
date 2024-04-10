import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Run all test cases
 * @author Vrushabh
 * @version 1.1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        warzone.model.ModelTestSuite.class,
        warzone.service.ServiceTestSuite.class,
        warzone.state.StateTestSuite.class,
        warzone.view.ViewTestSuite.class
})
public class TestSuite {

}
