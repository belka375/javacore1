package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class shw6 {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//*[@href='/login']"));
        loginButton.click();
        Thread.sleep(4000);

        WebElement id = driver.findElement(By.xpath("//*[@id='email']"));
        id.sendKeys("user");

        WebElement password = driver.findElement(By.xpath("//*[@id='email']//following::input[@id='password']"));
        password.sendKeys("password");

        WebElement login = driver.findElement(By.xpath("//*[@id='email']//following::button[@data-testid='loginSubmit']"));
        login.click();

        Assert.assertEquals(driver.findElements(By.xpath("//*[contains(@class, 'Home__HomeTagLine')]")).size(),1);
    }


}
