package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {

    @FindBy (xpath = "//*[@id='contact-link']/a")
    WebElement contactUsButton;

    @FindBy(xpath = "//*[@id='email']")
    WebElement inputEmail;

    @FindBy(xpath = "//*[@id='id_order']")
    WebElement inputReference;

    @FindBy(xpath = "//*[@id='submitMessage']/span")
    WebElement sendButton;

    @FindBy(xpath = "//*[@id='center_column']/div")
    WebElement comingErrorMess;

public ContactUs(WebDriver driver)
{PageFactory.initElements(driver, this);}

public void verifyContactUsPage(){
   contactUsButton.click();
   inputEmail.sendKeys("tast123@gmail.com");
   inputReference.sendKeys("123456789");
   sendButton.click();
   comingErrorMess.isDisplayed();
}
}
