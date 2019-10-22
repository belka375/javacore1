package HW9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class cssLogin {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }

    @Test
    public void deens_LoginPage_LoginSuccessfull_usingCSSSelectors() {
        driver.get("https://deens-master.now.sh/login");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("irina.skitayeva@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("malysh86");
        WebElement loginButton = driver.findElement(By.cssSelector("[data-testid='loginSubmit']"));
        loginButton.click();
        var customazibleTravelsText = driver.findElement(By.cssSelector("span:first-child"));

        Assert.assertTrue(true, String.valueOf(customazibleTravelsText));


    }



}
