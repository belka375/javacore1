package shw7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class shw7 {

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

    public void findElements() {
        driver.get("https://deens-master.now.sh/login");
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement email = driver.findElement(By.cssSelector("#email"));
        WebElement loginButton = driver.findElement(By.cssSelector(".ui.large.fluid.button.green-btn.pl-btn"));
        WebElement picture = driver.findElement(By.cssSelector(".login-img"));
        WebElement text1 = driver.findElement(By.cssSelector(".login-img-content"));
        WebElement forgotPassword = driver.findElement(By.cssSelector("a[href*='password']"));
        WebElement signUp = driver.findElement(By.cssSelector("[href ='/register']"));


    }

    @Test
    public void findElements1() {
        driver.get("https://deens-master.now.sh/");
WebElement deensLogo = driver.findElement(By.cssSelector("[data-testid=\"createTripHeaderButton\"]"));
WebElement text1 = driver.findElement(By.cssSelector(".Home__Secondary-dyIHIG.hcHCEV"));
WebElement earnMoney = driver.findElement(By.cssSelector("[href='/earn-money']"));
WebElement loginButton = driver.findElement(By.cssSelector(" [href = '/login']"));
WebElement signUp = driver.findElement(By.cssSelector(" [href = '/register']"));
WebElement createTrip = driver.findElement(By.cssSelector("[data-testid='createTripHeaderButton']"));
}
}