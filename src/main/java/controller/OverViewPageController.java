package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPageController {

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement womenButton;

    public OverViewPageController(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void womenCatalogPage(WebDriver driver){
    mouseOver(driver,womenButton);
    }

    public void mouseOver(WebDriver driver,WebElement element){
        Actions actions= new Actions(driver);
        actions.moveToElement(element).perform();
    }
}