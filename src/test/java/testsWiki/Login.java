package testsWiki;

import configWiki.ConfigurationWiki;
import configWiki.DataProviderWiki;
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
    @Test(dataProvider = "loginData", dataProviderClass = DataProviderWiki.class)
    public void loginTest2(Auth user) {
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginWikibutton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .logOut();
        //.clickOnFlowButton()
       // .isLogged();



    }
    @Test(dataProvider = "loginDataCvs",dataProviderClass = DataProviderWiki.class)
    public void loginDataFromCSV(Auth user) {
        String inf = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginWikibutton()
                .fillInLoginForm(user)
                .clickOnFlowButton()
                .isAccountPresentAssert()
                .logOut()
                //.isElOnMainPagePresAssert()
                .clickOnFlowButton()
                .getInf();
        Assert.assertEquals(inf, "Log in to Wikipedia");

    }


}
