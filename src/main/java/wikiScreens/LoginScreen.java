package wikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Auth;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends  BaseScreen {
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_username_text']")
    MobileElement username;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/text_input_password_toggle']")
    MobileElement toggleButton;
    @FindBy(xpath = "//*[@resource-id ='org.wikipedia:id/login_password_input']")
    MobileElement password;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/login_button'] ")
    MobileElement logButton;

    public MainScreen fillInLoginForm(Auth user) {

        type(username, user.getUsername());
        should(username, 40);
        toggleButton.click();
        password.click();
        Actions action = new Actions(driver);
        action.sendKeys(user.getPassword()).perform();
        should(logButton, 20);
        logButton.click();
        return new MainScreen(driver);
    }

    public MainScreen fillInLoginForm2(String login, String pwd) {

        type(username, login);
        should(username, 40);
        toggleButton.click();
        password.click();
        Actions action = new Actions(driver);
        action.sendKeys(pwd).perform();
        should(logButton, 20);
        logButton.click();
        return new MainScreen(driver);
    }
}
