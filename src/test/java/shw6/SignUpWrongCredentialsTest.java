package shw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpWrongCredentialsTest {
    private WebDriver driver;

    @BeforeMethod
    public void sratUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver 2");

        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        //destroi the browser

        driver.quit();
    }
    @Test
    public void deens_TryToSignUpUsingWrongCredentials_SignUpFailed() throws InterruptedException {
        //login ith wrong credentials

        driver.get("https://deens-master.now.sh/");

        Thread.sleep(2000);
        WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
        signUpButton.click();

        Thread.sleep(4000);
        WebElement id=driver.findElement(By.id("username"));
       // WebElement email = driver.findElement((By.id("email")));
        WebElement email = driver.findElement(By.xpath("//*[@id='username']/parent::*/parent::*/following-sibling::*[@class='required field']/child::*[@class='ui fluid left icon input']/child::*[@id='email']"));
      //  WebElement password = driver.findElement(By.id("password"));
       WebElement password = driver.findElement(By.xpath("//*[@id='username']/parent::*/parent::*/following-sibling::*[@class='required field']//child::*[@id='password']"));

        //указываем частичное название класса
        //WebElement register = driver.findElement(By.className("pl-btn"));
        WebElement register = driver.findElement(By.xpath("//*[@id='username']/parent::*/parent::*/following-sibling::*[text()='Register']"));

        id.sendKeys("user");
        email.sendKeys("email@email.com");
        password.sendKeys("password");
        register.click();

        Thread.sleep(2000);

        //проверяем если на странице есть сообщение об ошибке

        // Assert.assertTrue(driver.findElements(By.className("header")).size()!=0);
        Assert.assertEquals(driver.findElements(By.className("message")).size(),1);




    }

}



