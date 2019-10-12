package homeWorkTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login_Register {
    private WebDriver driver;

    @BeforeMethod
    public void sturtUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void deens_openHomePage_HomePageOpened() {
        driver.get("https://deens-master.now.sh/");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/", "Home page url is wrong!");
    }

    @Test
    public void deens_ClickOnLoginButton_LoginPageOpened() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        WebElement loginButon = driver.findElement(By.xpath("//a[@href = '/login']"));
        loginButon.click();
        Thread.sleep(6000);
        WebElement element1 = driver.findElement(By.xpath("//*[@class = 'login-img-content']"));
        String text = element1.getText();
        Assert.assertEquals(text, "Plan your next trip with us!");

    }

    @Test
    public void deens_ClickOnSignUpButton_SignUpPageOpened() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        WebElement signUpButton = driver.findElement(By.xpath("//a[@href='/register']"));
        signUpButton.click();
        Thread.sleep(6000);
        var signUpUrl = driver.getCurrentUrl();
        Assert.assertEquals(signUpUrl, "https://deens-master.now.sh/register", "URL for register page is wrong! Check URL!");

    }
}