package shw9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SignUpImplicitScc {
    private WebDriver driver;

    @BeforeMethod
    public void sratUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver 2");

        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);


        driver.quit();
    }

    @Test
    public void deens_TryToSignUpUsingGoodCredentials_SignUpPassed() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://deens-master.now.sh/");


        WebElement signUpButton = driver.findElement(By.cssSelector("[href='/register']"));
        signUpButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/register");
        WebElement signUpMessage = driver.findElement(By.cssSelector(".login-img-content"));

        String text = signUpMessage.getText();
        Assert.assertEquals(text, "Plan your next trip with us!");


        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("katarina86");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("886@mailinator.com");

        WebElement passord = driver.findElement(By.cssSelector("#password"));
        passord.sendKeys("88888888");

        WebElement registerButton = driver.findElement(By.cssSelector(".pl-btn"));
        registerButton.click();

//не могу понять почему у меня тест проходит только если я стовлю ссылку https://deens-master.now.sh/register????
        //поменяла местами ассерты и теперь все ок - сначало ждет пока элемент загрузится
        //и сообтветственно юрл страницы уже поменялся
        Assert.assertTrue(driver.findElements(By.cssSelector(".ls-is-cached")).size() != 0);
        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/");

    }
}




