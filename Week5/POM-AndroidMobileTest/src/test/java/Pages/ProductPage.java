package Pages;

import io.appium.java_client.android.AndroidDriver;

import static Constants.Contants.*;


public class ProductPage extends BasePage {

    public ProductPage(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public ProductPage selectOptions() {
        click(selectOptions);
        return this;
    }

    public ProductPage clickHomePage() {
        click(clickHomePage);
        return this;
    }

    public ProductPage clickEditTextSearch() {
        click(clickEditTextSearch);
        return this;
    }
    public ProductPage sendProduct(String product) {
        sendKeys(clickEditTextSearch,product);
        return this;
    }
    public ProductPage clickSearchSuggestionText() {
        click(textViewSearchSuggestionText);
        return this;
    }
    public ProductPage clickImageviewProduct() {
        click(imageviewProduct);
        return this;
    }



}