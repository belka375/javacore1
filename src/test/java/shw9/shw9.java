package shw9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class shw9 {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    private WebDriver driver;
    Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.crom.driver", "cromedriver.com");
        driver = new ChromeDriver();

        fluentWait = new FluentWait<WebDriver>(driver)
         .withTimeout(Duration.ofSeconds(30))
         .pollingEvery(Duration.ofMillis(200))
         .ignoring(NoSuchElementException.class);
    }

    @AfterMethod
    public void tearDown(){
            driver.quit();
    }

    @Test
    public void signUpImplicitWaitUsingCSS(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://deens-master.now.sh/");
        driver.findElement(By.cssSelector(".MobileHomeNav__Wrap-kjaSWJ.eGwaar")).click();
        driver.findElement(By.cssSelector("[href='/register']")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys(randomString(8));
        driver.findElement(By.cssSelector("#email")).sendKeys(randomString(5)+"@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys(randomString(10));
        driver.findElement(By.cssSelector(".ui.large.fluid.button.green-btn.pl-btn")).click();
        driver.findElement(By.cssSelector("[src*=data]")).click();
        Assert.assertEquals(driver.findElements(By.cssSelector(".MobileHomeNav__Menu-hRaywP.eJJdik :nth-child(7)")).size(), 1);
    }

    @Test
    public void signUpExplicitWaitUsingXpath() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='MobileHomeNav__Wrap-kjaSWJ eGwaar']")).isDisplayed());
        driver.findElement(By.xpath("//*[@class='MobileHomeNav__Wrap-kjaSWJ eGwaar']")).click();
        fluentWait.until(b->b.findElement(By.xpath("//*[@href='/register']")).isDisplayed());
        driver.findElement(By.xpath("//*[@href='/register']")).click();
        fluentWait.until(c->c.findElements(By.xpath("//*[@id='username']")).size()==1);
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(randomString(8));
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(randomString(5)+"@gmail.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(randomString(10));
        driver.findElement(By.xpath("//*[@class='ui large fluid button green-btn pl-btn']")).click();
        fluentWait.until(d->d.findElements(By.xpath("//*[@class='Home__HomeTagLine-iRolTP bAczAY']")).size()==1);
        driver.findElement(By.xpath("//*[@class='MobileHomeNav__Wrap-kjaSWJ eGwaar']")).click();
        Assert.assertEquals(driver.findElements(By.xpath("//*[contains(text(),'Logout')]")).size(), 1);
    }

}
