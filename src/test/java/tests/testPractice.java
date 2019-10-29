package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testPractice {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();


    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }


    @Test
    public void tryToOpenPage() throws InterruptedException {

        driver.get("https://deens-master.now.sh/");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");

        Thread.sleep(7000);
        driver.quit();

    }

    @Test
    public void deens_ClickLoginButton() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh/");

        //Act
        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();

        //Assert
        Thread.sleep(7000);
        WebElement loginHeader = driver.findElement(By.xpath("//div[@ class = 'login header']"));
        String text = loginHeader.getText();
        Assert.assertEquals(text, "Log-in to your account");

    }

    @Test
    public void deens_LoginWithWrondData() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement id = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.className("pl-btn"));

        id.sendKeys("user");
        password.sendKeys("password");
        login.click();

        Thread.sleep(2000);

        //Assert.assertEquals(driver.findElement(By.className("header")).size(),1);
    }
    @Test
    public void deens_LoginWithCSS_loginFailed() throws InterruptedException{
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.cssSelector("[href='/login']"));
        loginButton.click();
        Thread.sleep(4000);

        WebElement id = driver.findElement(By.cssSelector("#email"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement login = driver.findElement(By.cssSelector(".ui.large.fluid.button.green-btn.pl-btn"));
        Thread.sleep(5000);

        id.sendKeys("user");
        password.sendKeys("password");
        login.click();








    }
}




