package Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class BaseTest {
    protected static AndroidDriver<MobileElement> appiumDriver;
    protected static WebDriverWait appiumWait;

    @BeforeClass
    public void beforeScenario() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities
                .setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 30");
        desiredCapabilities
                .setCapability(MobileCapabilityType.APP,"/Users/ramazan/Downloads/Trendyol Online Shopping_v6.6.1.586.apk");
        desiredCapabilities
                .setCapability(MobileCapabilityType.NO_RESET, false);
        desiredCapabilities
                .setCapability(MobileCapabilityType.FULL_RESET, true);

        desiredCapabilities.setCapability("autoDismissAlerts", true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        appiumDriver = new AndroidDriver(url, desiredCapabilities);
        appiumWait = new WebDriverWait(appiumDriver,20);
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterScenario() {
        if(appiumDriver != null)
            appiumDriver.quit();
    }
}
