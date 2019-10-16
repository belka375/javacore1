package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork1 {
    private WebDriver driver;

    @BeforeMethod
    public void openLandingPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://deens-master.now.sh/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void deens_ClickLoginButton_LoginPageOpened() throws InterruptedException {
        //Arrange
       // driver.get("https://deens-master.now.sh/");

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
        // Assert




    }
    @Test
    public void deensClick() throws InterruptedException {
        WebElement deensClick = driver.findElement(By.xpath("//*[@src='/logo.svg']"));
        deensClick.click();
        //Assert
        Thread.sleep(3000);
        WebElement homeTag = driver.findElement(By.xpath("//*[@class='Home__HomeTagLine-iRolTP bAczAY']"));

        Assert.assertNotNull(homeTag);

    }

    @Test
    public void signUpClick() throws InterruptedException {
        //Act
        WebElement signUpButton = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
        signUpButton.click();
        Thread.sleep(3000);
//Assert
        WebElement createAnAccount = driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
        String text = createAnAccount.getText();
        Assert.assertEquals(text, "Create an account");
        Thread.sleep(3000);
//Act
        WebElement placeHolder = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        placeHolder.clear();
        placeHolder.sendKeys("smarot1000");
        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//*[@placeholder='E-mail address']"));
        email.clear();
        email.sendKeys("smarot1000@mail.ru");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        password.clear();
        password.sendKeys("Line100$#");
        Thread.sleep(3000);

        WebElement register = driver.findElement(By.xpath("//*[@class='ui large fluid button green-btn pl-btn']"));
        register.click();
        //Assert


    }

    @Test
    public void createTripButton() throws InterruptedException {
        WebElement createTrip = driver.findElement(By.xpath("//*[contains(text(),'Create Trip')]"));
        createTrip.click();
        //Assert
        Thread.sleep(3000);
        WebElement whereDoYouWant = driver.findElement(By.xpath("//*[@id='modal-root']/div/div[2]/div[1]/div[2]/div/div[1]/h2"));
        String text = whereDoYouWant.getText();
        Assert.assertEquals(text, "Where do you want to go?");

    }

    @Test
    public void earnMoneyButton() throws InterruptedException {
        WebElement earnMoney = driver.findElement(By.xpath("(//*[contains(text(),'Earn Money')])[1]"));
        earnMoney.click();
        //Assert
        Thread.sleep(3000);
        WebElement tripsIn = driver.findElement(By.xpath("//*[@class ='earn-money__Title-eVsjjP dyDlzj']"));
        String text = tripsIn.getText();
        Assert.assertEquals(text, "Earn Money");

    }
    @Test
    public void searchTripIn() throws InterruptedException {
        WebElement searchTrip = driver.findElement(By.xpath("//*[@placeholder='Type a city or country']"));
        searchTrip.clear();
        searchTrip.sendKeys("New York,  New York");
        searchTrip.sendKeys(Keys.ENTER);

        Thread.sleep(3000);


        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/search/trip?address=New%20York%2C%20New%20York%2C%20USA&city=New%20York&countryCode=US&lat=40.7127753&limit=25&lng=-74.0059728&locationSearchType=placeData&page=1&state=New%20York");
    }

}
