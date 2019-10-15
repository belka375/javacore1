package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        //practice
        WebElement deensLogo = driver.findElement(By.xpath("//*[@src='/logo.svg']"));
        deensLogo.click();
        WebElement bodyText = driver.findElement(By.xpath("//*[contains(@class,'Home__HomeTagLine')]"));
        String text1 = bodyText.getText();
        Assert.assertEquals(text1, "Customizable travels created by locals for free");

        WebElement searchBox = driver.findElement(By.xpath("//*[@class = 'HomeSearch__Input-kuDdmy dEnusz']"));
        searchBox.sendKeys("Los Angeles");
        searchBox.sendKeys(Keys.RETURN);



    }


}
