import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by yang on 15/05/2017.
 */
public class JunitRunner {

    public static void main(String[] args) {

        String className = "bean.ProductTest";
        Class class4Test = null;

        try {
            class4Test = Class.forName("bean.ProductTest");
        } catch (ClassNotFoundException e) {
            System.out.println("No this Class");
            e.printStackTrace();
        }

        Result result = JUnitCore.runClasses(class4Test);

        for (Failure failure : result.getFailures()) {
            System.out.println(className + " test: " + failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
