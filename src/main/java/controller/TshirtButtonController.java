package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtButtonController {

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    WebElement tShirtButton;

    @FindBy(xpath = "//*[@id='ul_layered_id_feature_6']/li")
    WebElement stylesSelected;

    public TshirtButtonController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void verifyTshirtButtonPage(){
        tShirtButton.click();
        stylesSelected.click();
    }

}
