import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;


public class TestRecord {
    private WebDriver driver;

    @BeforeMethod
    public void openLandingPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
       driver.quit();
    }

    @Test
    public void deens_ClickLoginButton_LoginPageOpened() throws InterruptedException {
        //Arrange
        driver.get("https://deens-master.now.sh/");

        //Act

        WebElement loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement loginHeader = driver.findElement(By.xpath("//*[@class='login-header']"));
        String text = loginHeader.getText();
        Assert.assertEquals(text, "Log-in to your account");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("smarot100");
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Online100$#");
        WebElement login = driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
        login.click();
       // Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Top Destinations')]" )));



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
