import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by User on 29.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        //tried to use runners here
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(JUnitTests.class);
        Result paramResult = runner.run(JUnitTestsParams.class);

        if (!result.getFailures().isEmpty())
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        else
            System.out.println("No mistakes in JUnitTests\n");
        if (!paramResult.getFailures().isEmpty())
            for (Failure failure : paramResult.getFailures()) {
                System.out.println(failure.toString());
            }
        else
            System.out.println("No mistakes in JUnitTests with parameters\n");

        System.out.println("Amount of JUnit tests: " + result.getRunCount() + "\n");
        System.out.println("Amount of JUnit tests with parameters: " + paramResult.getRunCount());
    }
}
