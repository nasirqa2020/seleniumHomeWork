package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchController {

    @FindBy(xpath = "//*[@id='search_query_top']")
    WebElement searchInputBox;

    @FindBy(name = "submit_search")
    WebElement submitSearch;


    public SearchController(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void verifySearchButtonController(String productName){
        searchInputBox.click();
        searchInputBox.sendKeys(productName);
        submitSearch.click();

    }
}
