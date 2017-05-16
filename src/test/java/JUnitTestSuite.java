import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.DiscountService;
import service.DiscountServiceTest;
import service.UpgradeServiceTest;

/**
 * Created by yang on 16/05/2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        DiscountServiceTest.class,
        UpgradeServiceTest.class
})
public class JUnitTestSuite {

}
