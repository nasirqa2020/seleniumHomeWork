package login;

import base.ScriptBase;
import controller.SearchController;
import org.testng.annotations.Test;

public class SearchTest extends ScriptBase {
    SearchController searchController;

    @Test
    public void verifySearchShoes(){
        searchController= new SearchController(driver);
        searchController.verifySearchButtonController("shoes");
    }
    @Test
    public void verifySearchProductCap(){
        searchController= new SearchController(driver);
        searchController.verifySearchButtonController("cap");
    }
    @Test
    public void verifySearchProductTops(){
        searchController= new SearchController(driver);
        searchController.verifySearchButtonController("tops");
    }
    @Test
    public void verifySearchProductTshirt(){
        searchController= new SearchController(driver);
        searchController.verifySearchButtonController("t-shirt");
    }
    @Test
    public void verifySearchProductDress(){
        searchController= new SearchController(driver);
        searchController.verifySearchButtonController("dress");
    }

}
