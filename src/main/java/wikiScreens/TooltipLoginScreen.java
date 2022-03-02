package wikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TooltipLoginScreen extends BaseScreen {
    public TooltipLoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement logButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement logOutButton;

    public LoginScreen clickOnLoginWikibutton() {
        logButton.click();
        return new LoginScreen(driver);
    }
    public  boolean isLogged(){
        should(logOutButton,20);
        return logOutButton.isDisplayed();

    }
    public TooltipLoginScreen isAccountPresentAssert() {
        Assert.assertTrue(logOutButton.isDisplayed());
        return this;
    }
}
