package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SHW4 {
    private WebDriver driver;
    @BeforeMethod
    public void  startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }
    @Test
    public void deens_clickOnSignUpButton_SignUpPageOpened() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh");
        //Act
        WebElement signUpButton = driver.findElement(By.xpath("//*[contains(text(),'Sign up')]"));
        signUpButton.click();
        //Assert
        Thread.sleep(2000);
        WebElement signUpHeader = driver.findElement(By.xpath("//*[@class='login-header']"));
        String text = signUpHeader.getText();
        Assert.assertEquals(text,"Create an account" );


    }
}
