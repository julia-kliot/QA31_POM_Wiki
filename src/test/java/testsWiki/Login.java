package testsWiki;

import configWiki.ConfigurationWiki;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;
import wikiScreens.MainScreen;

public class Login extends ConfigurationWiki {

    @Test
    public void  login1(){
        boolean isLogged= new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginWikibutton()
                .fillInLoginForm(Auth.builder().username("juliakliot.jk").password("Misha240613").build())
                .clickOnFlowButton()
                .isLogged();
        Assert.assertTrue(isLogged);
    }
}
