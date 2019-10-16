package shw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatingElements {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
        driver.get("https://deens.com/");
    WebElement loginButton = driver.findElement(By.linkText("Login"));
    loginButton.click();

    Thread.sleep(5000);

    WebElement id = driver.findElement(By.xpath ("//*[@class = 'required field']"));
    WebElement password = driver.findElement(By.xpath("//*[@class = 'required field']/following-sibling::div"));
    WebElement loginButton1 = driver.findElement(By.xpath("//*[@class = 'required field']/following-sibling:: button"));

    Thread.sleep(5000);

    id.sendKeys("Ivan");
     password.sendKeys("Petrov56");
    loginButton1.click();


    }
}





    // xpath for password = //*[@class = 'required field']/following-sibling::div
    // xpath for login button = //*[@class = 'required field']/following-sibling:: button
