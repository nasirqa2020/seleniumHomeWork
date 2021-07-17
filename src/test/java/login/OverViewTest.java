package login;
import base.ScriptBase;
import controller.OverViewPage;
import org.testng.annotations.Test;

public class OverViewTest extends ScriptBase {
    OverViewPage overViewPage;

    @Test
    public void verifyViewSpecials(){
        overViewPage=new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"Special");
    }
    @Test
    public void verifyViewNewProducts(){
        overViewPage=new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"New products");
    }
    @Test
    public void verifyViewSellers(){
        overViewPage=new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"Best sellers");
    }
    @Test
    public void verifyOverViewOurStores() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"Our stores");
    }
    @Test
    public void verifyOverViewTermsAndConditionsOfUse() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"Terms and conditions of use");
    }
    @Test
    public void verifyOverViewAboutUs() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"About us");
    }
    @Test
    public void verifyOverViewSiteMap() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"Sitemap");
    }
    @Test
    public void verifyOverViewWomen() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"Women");
    }
    @Test
    public void verifyOverViewMyOrders() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"My orders");
    }
    @Test
    public void verifyOverViewMyCreditSlips() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"My credit slips");
    }
    @Test
    public void verifyOverViewMyAddresses() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"My addresses");
    }
    @Test
    public void verifyOverViewMyPersonalInfo() {
        overViewPage = new OverViewPage(driver);
        OverViewPage.verifyOverViewTest(driver,"My personal info");
    }
}