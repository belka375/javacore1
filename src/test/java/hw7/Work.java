package hw7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Work {

    private WebDriver driver;



    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }
    @AfterTest
    public void tierDown() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void tryToFindDestination() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(5000);
        WebElement logIn = driver.findElement(By.xpath("//*[text()='Login']"));

        Thread.sleep(5000);
      logIn.click();
      Thread.sleep(2000);

      WebElement email = driver.findElement(By.id("email"));
      WebElement login = driver.findElement(By.name("password"));
WebElement clickLogin = driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));

Thread.sleep(2000);
email.sendKeys("email");
Thread.sleep(2000);
login.sendKeys("login");
Thread.sleep(3000);
clickLogin.click();

    }

    @Test

    public void clickOnSanFranciscoIcon_PageOpened() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(5000);

        WebElement sanFranciscoIcon = driver.findElement(By.xpath("//*[contains(@class,'SanFrancisco-coyFwL')]"));
        Thread.sleep(5000);
        sanFranciscoIcon.click();

    }
}
