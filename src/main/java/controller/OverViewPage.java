package controller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage {
    public OverViewPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
   public static void verifyOverViewTest(WebDriver driver, String demo){
        driver.findElement(By.xpath("//a[contains(text(),'"+demo+"')]")).isDisplayed();


   }
    }


