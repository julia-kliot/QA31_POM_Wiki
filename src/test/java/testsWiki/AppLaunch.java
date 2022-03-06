package testsWiki;

import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import wikiScreens.MainScreen;

public class AppLaunch extends ConfigurationWiki {

    @Test
    public void launchApp1(){
        logger.info("Start main page");
        String detail = new MainScreen(driver).getDetail();
        Assert.assertEquals(detail, "In the news");
    }
}
