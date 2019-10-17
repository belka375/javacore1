import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW6 {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear()throws InterruptedException {
        driver.get("https://deens-master.now.sh/login");
        Thread.sleep(7000);
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        email.sendKeys("irina");
        password.sendKeys("Irina256");

        var buttonLogin = driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
        //var messageCannotLogin = driver.findElement(By.xpath("//*[text()='Cannot login']"));
        buttonLogin.click();
        Assert.assertEquals("CannotLogin","CannotLogin");


    }
}