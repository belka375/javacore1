package tests;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_ClickLoginButton_LoginPageOpned() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh/");

        //Act
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();

        //Assert
        Thread.sleep(2000);
        WebElement loginHeader = driver.findElement(By.xpath("//*[@class='login-header']"));
        String text=loginHeader.getText();
        Assert.assertEquals(text, "Log-in to your account");
    }

    @Test
    public void searchInGoogle_searchingForCar_CarFound(){
        driver.get("https://google.com/");
        WebElement searchBox = driver.findElement(By.xpath("//*[@maxlength='2048']"));
        searchBox.sendKeys("Car");

        searchBox.sendKeys(Keys.RETURN);

//        WebElement searchButton = driver.findElement(By.xpath("(//*[@name='btnK'])[1]"));
//        searchButton.click();
    }

    @Test
    public void tryToLogin_TryToOpenBing_BingPageOpened(){
        driver.get("https://bing.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void tryToLogin_TryToOpenDeens_DeensPageOpened(){
        driver.get("https://deens-master.now.sh/");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void tryToLogin_TryUrlDeens_DeensUrl(){
        driver.get("https://deens-master.now.sh/");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/", "Expected URL is wrong");
    }

}
