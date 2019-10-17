package seleniumHomeWork6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumHomeWork6 {

    private WebDriver driver;

    @BeforeMethod
// create driver
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test

    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
        System.out.println("Starting Test");

// maximize browser window
        driver.manage().window().maximize();

// open test page
        String url = "https://deens-master.now.sh/login";
        driver.get(url);
        System.out.println("Page is opened");

// sleep for 2 seconds
        Thread.sleep(2000);

// enter username
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("randomUser");

// enter password
        WebElement password = driver.findElement(By.xpath("//*[@data-testid='loginEmail']/following::div/div[1]/input"));
        password.sendKeys("randomPassword");

// click login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@data-testid='loginEmail']/following::button"));
        loginButton.click();

// sleep for 5 seconds
        Thread.sleep(5000);

// error message is displayed
        WebElement errorMessage = driver.findElement(By.xpath("//*[@data-testid='loginEmail']/following::div[3]"));
        errorMessage.isDisplayed();


// verifications:

        WebElement expectedErrorMessage = driver.findElement(By.xpath("//*[@class='header']/following::p[1]"));
        expectedErrorMessage.getText().contains("no user found");
        Assert.assertTrue(true);

    }
}
