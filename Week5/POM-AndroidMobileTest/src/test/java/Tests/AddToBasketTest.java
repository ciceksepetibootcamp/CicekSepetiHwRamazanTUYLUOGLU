package Tests;

import Pages.LoginPage;
import Pages.ProductPage;
import org.testng.annotations.Test;

public class AddToBasketTest extends BaseTest {
    @Test(priority = 1)
    public void addToBasket() {
        LoginPage loginPage = new LoginPage(appiumDriver);
        ProductPage productPage = new ProductPage(appiumDriver);
        loginPage.clickTextView()
                .selectGenderMan()
                .clickMyAccountButton()
                .sendEmail("koskunlumamulleri@gmail.com").sendPassword("kosk3699328").clickLoginButton();
        productPage.selectOptions()
                .clickHomePage().clickEditTextSearch()
                .sendProduct("pantolon").clickSearchSuggestionText().clickImageviewProduct();
    }

}