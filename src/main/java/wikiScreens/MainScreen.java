package wikiScreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen extends BaseScreen {
    public MainScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
    MobileElement detailView;
    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    MobileElement serchButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/menu_overflow_button']")
    MobileElement flowButton;

    public String getDetail() {
        return detailView.getText();
    }

    public SearchScreen clickOnSearchFromMainPage() {
        serchButton.click();
        return new SearchScreen(driver);
    }

    public TooltipLoginScreen clickOnFlowButton() {
        should(flowButton,20);
        flowButton.click();
        return new TooltipLoginScreen(driver);
    }

}
