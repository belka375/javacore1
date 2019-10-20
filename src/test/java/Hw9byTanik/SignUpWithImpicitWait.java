package Hw9byTanik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpWithImpicitWait {

    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        driver.quit();
    }

    @Test
    public void deens_SignUp_Success() throws InterruptedException {

        driver.get("https://deens-master.now.sh/");

        WebElement signUpButton = driver.findElement(By.cssSelector("a[href='/register']"));
        signUpButton.click();

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("TanikTester3");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("tanik3@mailinator.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("helloFromTanik");

        WebElement login = driver.findElement(By.cssSelector(".green-btn.pl-btn"));
        login.click();

        Assert.assertTrue(driver.findElements(By.cssSelector("div[class*='Avatar']")).size()==1);
    }

}
