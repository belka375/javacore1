package homework;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SHW9 {
    private WebDriver driver;
    Wait<WebDriver>fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(20))
                .ignoring(NoSuchElementException.class);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


//    Создать 2 теста
//1. implicit wait + cssSelectors
//2. fluent wait + xpath
//автоматизировать на сайте https://deens-master.now.sh/
//workflow -> Sign up:
//а. открыть страницу регистрации,
//б. заполнить поля
//в. зарегистрироваться
//г. ассертать

    //implicit wait
    @Test
    public void deens_tryToSignUpUsingCssCelectors_signUpUsingImplicitWait(){
        driver.get("https://deens-master.now.sh/");

        WebElement signUpButton = driver.findElement(By.cssSelector("[href='/register']"));
        signUpButton.click();

        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("Natalia9867");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("natalia9867@tester.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("password");

        WebElement registerButton = driver.findElement(By.cssSelector(".green-btn"));
        registerButton.click();

        WebElement mainPage = driver.findElement(By.cssSelector(".Home__HomeTagLine-iRolTP"));
        var text = mainPage.getText();
        Assert.assertEquals(text, "Customizable travels created by locals for free");
    }

    //fluent wait
    @Test
    public void deens_tryToSignUpUsingXpath_signUpUsingFluentWait(){
        driver.get("https://deens-master.now.sh/");

        fluentWait.until(x->driver.findElement(By.xpath("//*[@href='/register']")).isEnabled());
        driver.findElement(By.xpath("//*[@href='/register']")).click();

        fluentWait.until(x->driver.findElement(By.xpath("//*[@id='username']")).isDisplayed());
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("NovyUser");

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("novytester@tester.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//*[contains(text(),'Register')]")).click();

        fluentWait.until(x->driver.findElement(By.xpath("//*[contains(@class,'Home__HomeTagLine')]")).isDisplayed());
        WebElement mainPage = driver.findElement(By.xpath("//*[contains(@class,'Home__HomeTagLine')]"));
        var text = mainPage.getText();
        Assert.assertEquals(text, "Customizable travels created by locals for free");
    }


}

