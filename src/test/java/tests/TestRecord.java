package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class TestRecord {
    private WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        wait = new WebDriverWait(driver, 20);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        sleep(7000);
        driver.quit();
    }

    @Test
    public void  deens_TryToLoginWithWrongCredentials_LoginFailed() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://deens-master.now.sh");
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();

        WebElement email = driver.findElement(By.id("email"));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        email.sendKeys("email");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");

        WebElement login = driver.findElement(By.className("pl-btn"));
        login.click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".ui.error.message"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }

    @Test
    public void searchInGoogLe_searchingForACar_CarFound() {
        driver.get("http://google.com/");

            WebElement searchBox = driver.findElement(By.xpath("//*[@maxlength='2048']"));
            searchBox.sendKeys("Car");

            Assert.assertEquals(searchBox.getAttribute("value"),"Car");

            WebElement searchButton = driver.findElement(By.xpath("//*[@name='btnK']"));

            Assert.assertTrue(searchButton.isDisplayed());



//        try{
//            WebElement searchBox = driver.findElement(By.xpath("//*[@maxlength='2048']"));
//            searchBox.sendKeys("Car");
//
//            List<WebElement> searchButtons = driver.findElements(By.xpath("//*[@name='btnK']"));
//            searchButtons.forEach(button->{
//                if(button.isDisplayed()){
//                    button.click();
//                }
//            });
//        }catch(Exception x){
//
//        }


//        searchBox.sendKeys(Keys.RETURN);

//        WebElement searchButton = driver.findElement(By.xpath("(//*[@name='btnK'])[1]"));
//        searchButton.click();

    }

    @Test
    public void deens_ClickLoginButton_LoginPageOpened() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh/");

        //Act
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();

        //Assert
        sleep(2000);
        WebElement loginHeader = driver.findElement(By.xpath("//*[@class='login-header']"));
        String text=loginHeader.getText();
        Assert.assertEquals(text,"Log-in to your account");
    }

    // //*[@class='login-img-content']
    // //*[text()='Plan your next trip with us!']
    // //*[contains(text(),'next trip')]

    @Test
    public void openUrl_TryToOpenDeens_GoogleOpened()  {
        driver.get("https://google.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void openUrl_TryToOpenDeens_BingOpened(){
        driver.get("https://Bing.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void openUrl_TryToOpenDeens_DeensOpened(){
        driver.get("https://deens-master.now.sh/");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void openUrl_TryToOpenDeensCheckUrl_DeensOpened(){
        driver.get("https://deens-master.now.sh/");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://deens-master.now.sh/", "Expected URL is wrong");
    }

}
