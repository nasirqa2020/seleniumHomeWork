package login;

import base.ScriptBase;
import controller.ContactUs;
import org.testng.annotations.Test;

public class ContactUsTest extends ScriptBase {
    controller.ContactUs ContactUs;
    @Test
    public void verifyContactPageWorkProperly() {
        ContactUs = new ContactUs (driver);
        ContactUs.verifyContactUsPage();
    }
}
