package base;

//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ScriptBase {
    public WebDriver driver;

    @Test
    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

         }

        @Test
        public void init2 () throws InterruptedException {
           System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver 3");
            Thread.sleep(5000);
            driver = new FirefoxDriver();
            driver.get("http://automationpractice.com/index.php");
        }

        @Test
        public void init3 () {
            System.setProperty("webdriver.safari.noinstall", "true");
            driver = new SafariDriver();
            driver.get("http://automationpractice.com/index.php");
        }
    @Test
    public void init4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }
    @Test
    public void init5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }
    }