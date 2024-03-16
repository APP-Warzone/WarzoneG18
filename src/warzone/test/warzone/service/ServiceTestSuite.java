package warzone.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test all test class of package warzone.service
 * @author Khushi
 * @version 1.1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        GameEngineServiceTest.class,
        MapServiceTest.class,
        RouterServiceTest.class,
        StartupServiceTest.class
})
public class ServiceTestSuite {

}