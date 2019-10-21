package hw7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Work {

    private WebDriver driver;
    //    WebDriverWait wait;
//    WebDriver longWait;
    Wait<WebDriver> fluentWait;
    WebDriverWait wait;


    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);

        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);


        var notFound = true;
//        while(notFound){
//            try {
//                driver.findElement(By.xpath("#email"));
//                notFound=false;
//            }catch(NoSuchElementException x ){
//            }
//            Thread.sleep(500);
    }

//        wait = new WebDriverWait(driver, 30);
//        longWait = (WebDriver) new WebDriverWait(driver, 200);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(25, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    @AfterTest
    public void tierDown() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void tryToFindDestination() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");


//        fluentWait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver){
//                return driver.findElement(By.xpath("//*[@href='/login']"));
//            }
//        });
        fluentWait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")).isEnabled());

//      wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[href='/login']"))));
        driver.findElement(By.cssSelector("[href='/login']")).click();

//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#email"))));
        fluentWait.until(x -> x.findElement(By.cssSelector("#email")).isDisplayed());
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("email");

        WebElement login = driver.findElement(By.name("password"));
        WebElement clickLogin = driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));


        login.sendKeys("login");
        Thread.sleep(3000);
        clickLogin.click();

    }

//    @Test
//
//    public void clickOnSanFranciscoIcon_PageOpened() throws InterruptedException {
//        driver.get("https://deens-master.now.sh/");
//        Thread.sleep(5000);
//
//        WebElement sanFranciscoIcon = driver.findElement(By.xpath("//*[contains(@class,'SanFrancisco-coyFwL')]"));
//        Thread.sleep(5000);
//        sanFranciscoIcon.click();

}

