package testsWiki;

import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import wikiScreens.MainScreen;

public class SearchArticle2 extends ConfigurationWiki {

     @Test
    public void SearchArticlenew(){
          boolean isLiner = new MainScreen(driver)
                  .clickOnSearchFromMainPage()
                  .fillInText("dog")
                 .closeBoard()
                 .isLiner();

         Assert.assertTrue(isLiner);
     }
}
