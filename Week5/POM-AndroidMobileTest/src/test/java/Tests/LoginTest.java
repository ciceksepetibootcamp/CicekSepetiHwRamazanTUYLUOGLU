package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.clickTextView()
                .selectGenderMan()
                .clickMyAccountButton()
                .sendEmail("koskunlumamulleri@gmail.com").sendPassword("kosk3699328").clickLoginButton();
    }
}