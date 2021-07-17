package login;

import base.ScriptBase;
import controller.WomenButtonController;
import org.testng.annotations.Test;

public class WomenButtonTest extends ScriptBase {
    WomenButtonController womenButtonController;

 @Test
 public void verifyWomenButtonWorkProperly(){
     womenButtonController=new WomenButtonController(driver);
   womenButtonController.verifyWomenButtonControllerPage();
 }
}
