package driver;

import VideoRecorder.VideoRecord;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver() throws Exception {
        VideoRecord.startRecord("AkbankUiTest");//Starting point of video recording

        webDriver = DriverFactory.getDriver();

        webDriver.manage().window().maximize();
    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver() throws Exception {
        webDriver.quit();
        VideoRecord.stopRecord();
    }

}
