package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;

    @FindBy(id = "email")
    WebElement emailSendkey;

    @FindBy(id = "passwd")
    WebElement passwdSendkey;

    @FindBy(css = "#SubmitLogin > span")
    WebElement SigninSubmitButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void inValidSigning(String email,String passwd){
        signInButton.click ();
        emailSendkey.sendKeys(email);
        passwdSendkey.sendKeys(passwd);
        SigninSubmitButton.click();
    }
}
