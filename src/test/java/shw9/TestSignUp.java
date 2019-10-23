package shw9;

import org.openqa.selenium.By;
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
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class TestSignUp {
    private WebDriver driver;
    Wait<WebDriver> fluentWait;
    Random rand = new Random();
    int value = rand.nextInt(20);

    @Test
    public void TryToSignUpUsingImplicitWait () throws InterruptedException{
        System.setProperty("webdriver.chrom.driver", "chromdriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://deens-master.now.sh/");
        WebElement signUpButton = driver.findElement(By.cssSelector("[href = '/register']"));
        signUpButton.click();

        WebElement userField = driver.findElement(By.cssSelector("#username"));
        userField.sendKeys("IvanIvanov980" + value);

        WebElement emailField = driver.findElement(By.cssSelector("#email"));
        emailField.sendKeys("ivanivanov88897000@mail" + value +".ru");

        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("hnbDT78&&0980"+ value);

        WebElement registerButton = driver.findElement(By.cssSelector(".green-btn"));
        registerButton.click();

        WebElement createTripButton = driver.findElement(By.cssSelector("[href = '/new/trip']"));

        Assert.assertTrue(createTripButton.isDisplayed());

        driver.quit();

    }

    @Test
  public void TryToSignUpUsingFluentWait () throws InterruptedException {
       System.setProperty("webdriver.chrom.driver", "chromdriver");
        driver = new ChromeDriver();
      fluentWait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(20))
           .pollingEvery(Duration.ofMillis(100))
           .ignoring(NoSuchElementException.class);

           driver.get("https://deens-master.now.sh/");
           fluentWait.until(driver -> driver.findElement(By.xpath("//*[@href = '/register']")).isDisplayed());
           WebElement signUpButton = driver.findElement(By.xpath("//*[@href = '/register']"));
          // fluentWait.until(driver->driver.findElement(By.xpath("//*[@href = '/register']")).isEnabled());
           signUpButton.click();

            WebElement userField = driver.findElement(By.xpath("//*[@id ='username']"));
            fluentWait.until(driver->driver.findElement(By.xpath("//*[@id ='username']")));
        Thread.sleep(3000);
            userField.sendKeys("PetrPetrov9578" + value);

            WebElement emailField = driver.findElement(By.xpath("//*[@id ='email']"));
            fluentWait.until(driver-> driver.findElement(By.xpath("//*[@id ='email']")).isEnabled());
        Thread.sleep(3000);
            emailField.sendKeys("petr896615@inbox" +value +".ru");

            WebElement passwordField = driver.findElement(By.xpath("//*[@id ='password']"));
           fluentWait.until(driver-> driver.findElement(By.xpath("//*[@id ='email']")).isEnabled());
        Thread.sleep(3000);
            passwordField.sendKeys("8715uy0uiHG%$" + value);

            WebElement registerButton = driver.findElement(By.xpath("//*[text() = 'Register']"));
            fluentWait.until(driver->driver.findElement(By.xpath("//*[text() = 'Register']")).isEnabled());
        Thread.sleep(3000);
            registerButton.click();

            WebElement createTripButton = driver.findElement(By.xpath("//*[text() = 'Create Trip']"));
            Assert.assertTrue(createTripButton.isDisplayed());

          driver.quit();



  }
}
