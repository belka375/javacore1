package hwDeensTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeensMainPage {
    private WebDriver driver;
    @BeforeMethod
    public void deens(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public  void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void mainPage_logInButton_logInPageOpened() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        var loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();
        Assert.assertEquals();
    }
    public void mainPage_earnMoneyButton_earnMoneyPageOpened(){
        driver.get("https://deens-master.now.sh/");
        var  earnMoneyButton=driver.findElement(By.xpath("//*[@href='/earn-money']"));
        earnMoneyButton.click();
    }
    public void mainPage_createTripButton_createTripPageOpened(){
        driver.get("https://deens-master.now.sh/");
        var createTripButton=driver.findElement(By.xpath("//*[@activeclassname='is-active'][2]"));
        createTripButton.click();
    }
    public void mainPage_signUpButton_sighUpPageOpened(){
        driver.get("https://deens-master.now.sh/");
        var signUpButton=driver.findElement(By.xpath("//*[@href='/register']"));
        signUpButton.click();
    }
    public void mainPage_whereDoyouWantToGoText_textPresentOnMainPage(){
        driver.get("https://deens-master.now.sh/");
        String text =driver.get();
    }
}
