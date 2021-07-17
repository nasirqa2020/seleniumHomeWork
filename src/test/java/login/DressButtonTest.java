package login;

import base.ScriptBase;
import controller.DressButtonController;
import controller.WomenButtonController;
import org.testng.annotations.Test;

public class DressButtonTest extends ScriptBase {
 DressButtonController dressButtonController;

    @Test
    public void verifyDressButtonWorkProperly(){
      dressButtonController=new DressButtonController(driver);
       dressButtonController.verifyDressButtonPage();
    }
}
