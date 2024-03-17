package warzone.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test all test class of package warzone.service
 * @author Khushi
 * @version 1.1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdvanceOrderTest.class,
        AirliftOrderTest.class,
        BlockadeOrderTest.class,
        BombOrderTest.class,
        CountryTest.class,
        DeployOrderTest.class,
        NegotiateOrderTest.class,
        WarzonePropertiesTest.class
})
public class ModelTestSuite {

}