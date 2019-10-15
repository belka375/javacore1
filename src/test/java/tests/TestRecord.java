package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
    public void deens_TryToLoginUsingWrongCredentials_LoginFailed() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement id = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.className("pl-btn"));

        id.sendKeys("user");
        password.sendKeys("password");
        login.click();

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElements(By.className("header")).size()!=0);




    }

    @Test
    public void searchInGoogle_searchingForACar(){

        //Arrange
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.xpath("//*[@maxlength]"));
        searchBox.sendKeys("Car");

        WebElement searchButton = driver.findElement(By.xpath("//*[@name='btnK']"));


//        List<WebElement> searchButtons = driver.findElements(By.xpath("//*[@name='btnK']"));
//        searchButtons.forEach(button->{
//            if(button.isDisplayed()){
//                button.click();
//            }
//        });

//        searchBox.sendKeys(Keys.RETURN);

//        WebElement searchButton = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));
//        searchButton.click();




    }

    @Test
    public void deens_clickLoginButton_LoginPageOpened() throws InterruptedException{
        //Arrange
        driver.get("https://deens-master.now.sh");

        //Act
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();

        //Assert
        Thread.sleep(2000);
        WebElement loginHeader =  driver.findElement(By.xpath("//*[@class='login-header']"));
        String text = loginHeader.getText();
        Assert.assertEquals(text, "1Log-in to your account");

        // //*[@class='login-img-content']
        // Plan your next trip with us!
        // //*[contains(text(),'next trip')]


    }
    @Test

    public void openUrl_TryToOPenDeens_GoogleOpened()  {
        driver.get("https://google.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");


    }
    @Test
    public void openUrl_TryToOPenDeens_BingOpened(){
        driver.get("https://bing.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");

    }

    @Test
    public void openUrl_TryToOPenDeens_DeensOpened(){
        driver.get("https://deens-master.now.sh");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");

    }
    @Test
    public void openUrl_TryToOPenDeensCheckUrl_DeensOpened (){
        driver.get("https://deens-master.now.sh");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/", "Expected URL is wrong");

    }


}
