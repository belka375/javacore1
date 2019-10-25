import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestRecord {
    private WebDriver driver;
    WebDriverWait wait;
    WebDriverWait longWait;

    @BeforeMethod
    public void openLandingPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        longWait = new WebDriverWait(driver, 200);

       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://deens-master.now.sh/");
    }
    @AfterMethod
    public void tearDown(){
       driver.quit();
    }

    @Test
    public void deens_ClickLoginButton_LoginPageOpened(){
        //Arrange => BeforeMethod

        //Act

        WebElement loginButton = driver.findElement(By.cssSelector("[href='/login']"));
        loginButton.click();


        WebElement loginHeader = driver.findElement(By.cssSelector("[class = 'login-header']"));
        String text = loginHeader.getText();
        Assert.assertEquals(text, "Log-in to your account");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("smarot100");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Online100$#");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Login')]")));
        driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();

        //Assert



    }

    @Test
    public void openUrl_TryToOpenDeens_GoogleOpened(){
        driver.get("https://google.com");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Google", "Wrong title");
        WebElement inputField = driver.findElement(By.xpath("//*[@name='q']"));
        inputField.sendKeys("Cat");

        //inputField.sendKeys(Keys.ENTER);

        List<WebElement> searchButtons = driver.findElements(By.xpath("(//*[@name='btnK'])"));
        searchButtons.forEach(button->{
            if(button.isDisplayed()){
                button.click();
            }
        });
    }









    //Arrange
    //Act
    //Assert

}
