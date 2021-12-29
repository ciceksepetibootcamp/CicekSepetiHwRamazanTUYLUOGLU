package Pages;

import io.appium.java_client.android.AndroidDriver;

import static Constants.Contants.*;


public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public LoginPage clickTextView() {
        click(TextView);
        return this;
    }

    public LoginPage selectGenderMan() {
        click(selectGenderManButton);
        return this;
    }

    public LoginPage clickMyAccountButton() {
        click(clickMyAccount);
        return this;
    }

    public LoginPage sendEmail(String text) {
        sendKeys(editTextEmail,text);
        return this;
    }
    public LoginPage sendPassword(String text) {
        sendKeys(editTextPassword,text);
        return this;
    }
    public LoginPage clickLoginButton() {
        click(buttonLogin);
        return this;
    }


}