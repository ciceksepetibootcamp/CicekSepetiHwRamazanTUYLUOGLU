package Pages;

import Tests.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BasePage extends BaseTest {
    public AndroidDriver<MobileElement> appiumDriver;
    public WebDriverWait appiumWait;

    public BasePage (AndroidDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.appiumWait = new WebDriverWait(appiumDriver, 20);
    }
    public MobileElement findElement(By by){
        appiumWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return appiumDriver.findElement(by);
    }
    public void click(By by){
        findElement(by).click();
    }
    public void sendProduct(By by,String product){
        findElement(by).sendKeys(product);
    }
    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }
    public List<MobileElement> findElements(By by){
        appiumWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return appiumDriver.findElements(by);
    }

}