package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class TestListener implements ITestListener {
    private static WebDriver driver;

    // Set WebDriver instance from test
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        if (driver != null) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
        }
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished");
    }
}
