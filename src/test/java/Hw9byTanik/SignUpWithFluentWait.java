package Hw9byTanik;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignUpWithFluentWait {

    private WebDriver driver;
    Wait<WebDriver> fluentWait;

        @BeforeMethod
        public void startUp(){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
            fluentWait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class);
        }

        @AfterMethod
        public void tearDown() throws InterruptedException{
            driver.quit();
        }

        @Test
        public void deens_SignUp_Success() throws InterruptedException {

            driver.get("https://deens-master.now.sh/");


            fluentWait.until(x->driver.findElement(By.xpath("//a[@href='/register']")).isDisplayed());
            WebElement signUpButton = driver.findElement(By.xpath("//a[@href='/register']"));
            signUpButton.click();

            fluentWait.until(x->driver.findElement(By.xpath("//*[@id='username']")).isDisplayed());
            WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
            username.sendKeys("TanikTester7");

            WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
            email.sendKeys("tanik7@mailinator.com");

            WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
            password.sendKeys("helloFromTanik");

            WebElement login = driver.findElement(By.xpath("//button[contains(.,'Register')]"));
            login.click();

//            fluentWait.until(x->driver.findElement(By.xpath("//img[contains(@src,'logo')]")));

            fluentWait.until(x->driver.findElement(By.xpath("//img[contains(@src,'world')]")));

            Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'Avatar')]")).size()==1);
        }

    }

