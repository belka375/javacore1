package homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SHW6 {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_tryToLoginUsingWrongCredentials_loginFailedErrorMessageAppear() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@href='/login']"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        userName.sendKeys("name");

        WebElement password = driver.findElement(By.xpath("//*[@id='email']/parent::*/parent::*/following-sibling::*/*/*[1]"));
        password.sendKeys("somepassword");

        WebElement login = driver.findElement(By.xpath("//*[@id='email']/parent::*/parent::*/following-sibling::*/following-sibling::*"));
        login.click();

        Thread.sleep(2000);

        WebElement loginNote = driver.findElement(By.xpath("//*[@class='header']"));
        var note = loginNote.getText();
        Assert.assertEquals(note, "Cannot login");

        Thread.sleep(3000);

    }

}
