package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenButtonController {

  @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement womenButton;

  @FindBy(xpath = "//*[@id=\"categories_block_left\"]/h2")
    WebElement topsButton;

  @FindBy(xpath = "//*[@id='categories_block_left']/div/ul/li[1]/a")
  WebElement TshirtButton;

  @FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]")
  WebElement sizeSelected;

  public WomenButtonController(WebDriver driver){
    PageFactory.initElements(driver, this);
  }

  public void verifyWomenButtonControllerPage(){
    womenButton.click();
    topsButton.click();
    TshirtButton.click();
    sizeSelected.click();
  }
}
