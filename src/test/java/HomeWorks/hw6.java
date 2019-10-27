package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class hw6 {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
        driver.get("https://deens-master.now.sh/login");
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement logInButton = driver.findElement(By.xpath("//*[contains(@class, 'ui large fluid')]"));


        email.sendKeys("User");
        password.sendKeys("Password");
        logInButton.click();

        Thread.sleep(3000);

        Assert.assertTrue(driver.findElements(By.xpath("//*[@class='ui error message']")).size()!=0);



    }






}
