package login;

import base.ScriptBase;
import controller.OverViewPageController;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OverViewPageTest extends ScriptBase {
    OverViewPageController overViewPageController;

    @Test
    public void verifyMouseOverDisplayed(){
      overViewPageController=new OverViewPageController(driver);
      overViewPageController.womenCatalogPage(driver);
    }
}
