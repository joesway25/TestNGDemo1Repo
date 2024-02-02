import org.testng.annotations.Test;

public class TestCases {

    @Test(priority=1)
    void setup() {
        System.out.println("I am inside setup");
    }

    @Test(priority=3)
    void testSteps() {
        System.out.println("I am inside test steps");
    }

    @Test(priority=2)
    void tearDown() {
        System.out.println("I am inside tear down");
    }
    {
System.out.println(System.getProperty("java.class.path")); }
}