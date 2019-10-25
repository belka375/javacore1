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

import java.util.concurrent.TimeUnit;

public class HomeWork_7 {
        private WebDriver driver;

        @BeforeMethod
        public void openLandingPage() {

            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://deens-master.now.sh/");
        }

        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

        @Test
        public void searchTripIn(){
            WebElement searchTrip = driver.findElement(By.cssSelector("[class='HomeSearch__Input-kuDdmy dEnusz']"));
            searchTrip.clear();
            searchTrip.sendKeys("New York,  New York");
            searchTrip.sendKeys(Keys.ENTER);

        }
        @Test
        public void deens_ClickLoginButton_LoginPageOpened(){
            //Arrange

            //Act
            WebElement loginButton = driver.findElement(By.cssSelector("[href='/login']"));
            loginButton.click();
            WebElement loginHeader = driver.findElement(By.cssSelector("[class='login-header']"));
            String text = loginHeader.getText();
            Assert.assertEquals(text, "Log-in to your account");

            WebElement email = driver.findElement(By.cssSelector("[id='email']"));
            email.clear();
            email.sendKeys("smarot100");
            WebElement password = driver.findElement(By.cssSelector("[id=password]"));
            password.clear();
            password.sendKeys("Online100$#");
            WebElement login = driver.findElement(By.cssSelector("[class='ui large fluid button green-btn pl-btn']"));
            login.click();
            // Assert
            WebElement header = driver.findElement(By.xpath("//*[contains (text(), 'Top Destinations')]"));
           String text1 = header.getText();
           Assert.assertEquals(text1,  "Top Destinations");



        }
        @Test
        public void deensClick(){
            WebElement deensClick = driver.findElement(By.cssSelector("[src='/logo.svg']"));
            deensClick.click();
            //Assert
            WebElement homeTag = driver.findElement(By.xpath("//*[@class='Home__HomeTagLine-iRolTP bAczAY']"));
            // Assert
            WebElement header = driver.findElement(By.xpath("//*[contains (text(), 'Top Destinations')]"));
            String text1 = header.getText();
            Assert.assertEquals(text1,  "Top Destinations");

        }

        @Test
        public void signUpClick(){
            //Act
            WebElement signUpButton = driver.findElement(By.cssSelector("[href='/register']"));
            signUpButton.click();
//Assert
            WebElement createAnAccount = driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
            String text = createAnAccount.getText();
            Assert.assertEquals(text, "Create an account");
//Act
            WebElement placeHolder = driver.findElement(By.cssSelector("[id='username']"));
            placeHolder.clear();
            placeHolder.sendKeys("smarot1000");

            WebElement email = driver.findElement(By.cssSelector("[id='email']"));
            email.clear();
            email.sendKeys("smarot1000@mail.ru");

            WebElement password = driver.findElement(By.cssSelector("[id='password']"));
            password.clear();
            password.sendKeys("Line100$#");

            WebElement register = driver.findElement(By.cssSelector("[class='ui large fluid button green-btn pl-btn']"));
            register.click();
            //Assert


        }

        @Test
        public void createTripButton(){
            WebElement createTrip = driver.findElement(By.xpath("//*[contains(text(),'Create Trip')]"));
            createTrip.click();
            //Assert
            WebElement whereDoYouWant = driver.findElement(By.cssSelector("[class='commonStyles__H2Subtitle-hXjBTD jfqEVh']"));
            String text = whereDoYouWant.getText();
            Assert.assertEquals(text, "Where do you want to go?");

        }

        @Test
        public void earnMoneyButton(){
            WebElement earnMoney = driver.findElement(By.xpath("(//*[contains(text(),'Earn Money')])[1]"));
            earnMoney.click();
            //Assert
            WebElement tripsIn = driver.findElement(By.cssSelector("[class='earn-money__Title-eVsjjP dyDlzj']"));
            String text = tripsIn.getText();
            Assert.assertEquals(text, "Earn Money");

        }


    }


