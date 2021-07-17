package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressButtonController {

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    WebElement dressButton;

    @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[3]/a")
    WebElement summerDress;

    @FindBy(xpath = "//*[@id='layered_id_attribute_group_8']")
    WebElement colorSelected;

    public DressButtonController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void verifyDressButtonPage(){
        dressButton.click();
        summerDress.click();
        colorSelected.click();
    }
}
