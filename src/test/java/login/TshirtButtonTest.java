package login;

import base.ScriptBase;
import controller.DressButtonController;
import org.testng.annotations.Test;

public class TshirtButtonTest extends ScriptBase {
    DressButtonController dressButtonController;

    @Test
    public void verifyTshirtButtonWorkProperly(){
        dressButtonController=new DressButtonController(driver);
        dressButtonController.verifyDressButtonPage();
    }
}
