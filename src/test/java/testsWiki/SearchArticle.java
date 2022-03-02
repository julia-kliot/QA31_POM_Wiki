package testsWiki;

import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import wikiScreens.MainScreen;
import wikiScreens.SearchScreen;

public class SearchArticle extends ConfigurationWiki {
 @BeforeMethod
    public void preconditions(){
     new MainScreen(driver).clickOnSearchFromMainPage();
 }

 @Test
    public void searchTest(){
     boolean isLiner = new SearchScreen(driver)
             .fillInText("dog")
             .closeBoard()
             .isLiner();

     Assert.assertTrue(isLiner);
 }

}
