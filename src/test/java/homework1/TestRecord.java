package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecord {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_ClickSignUpButton_SignUpPageOpened() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh/");
        //Act
        WebElement signupButton=driver.findElement(By.xpath("//a[@href='/register']"));
        signupButton.click();
        //Assert
        Thread.sleep(1000);
        WebElement signupHeader=driver.findElement(By.xpath("//*[@class='login-header']"));
        String text=signupHeader.getText();
        Assert.assertEquals(text, "Create an account");
    }

    @Test
    public void deens_ClickSignUpButton_SignUpPageNotOpened() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh/");
        //Act
        WebElement signupButton=driver.findElement(By.xpath("//a[@href='/register']"));
        signupButton.click();
        //Assert
        Thread.sleep(1000);
        WebElement signupHeader=driver.findElement(By.xpath("//*[@class='login-header']"));
        String text=signupHeader.getText();
        Assert.assertEquals(text, "1Create an account");
    }
}
