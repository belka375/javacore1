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

public class HomeWork_7 {
        private WebDriver driver;

        @BeforeMethod
        public void openLandingPage() {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://deens-master.now.sh/");
        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

        @Test
        public void searchTripIn() throws InterruptedException {
            Thread.sleep(3000);
            WebElement searchTrip = driver.findElement(By.cssSelector("[class='HomeSearch__Input-kuDdmy dEnusz']"));
            Thread.sleep(3000);
            searchTrip.clear();
            searchTrip.sendKeys("New York,  New York");
            Thread.sleep(3000);
            searchTrip.sendKeys(Keys.ENTER);

        }
        @Test
        public void deens_ClickLoginButton_LoginPageOpened() throws InterruptedException {
            //Arrange

            //Act
            WebElement loginButton = driver.findElement(By.cssSelector("[href='/login']"));
            loginButton.click();
            Thread.sleep(3000);
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
            Thread.sleep(3000);
            WebElement header = driver.findElement(By.xpath("//*[contains (text(), 'Top Destinations')]"));
           String text1 = header.getText();
           Assert.assertEquals(text1,  "Top Destinations");



        }
        @Test
        public void deensClick() throws InterruptedException {
            WebElement deensClick = driver.findElement(By.cssSelector("[src='/logo.svg']"));
            deensClick.click();
            //Assert
            Thread.sleep(3000);
            WebElement homeTag = driver.findElement(By.xpath("//*[@class='Home__HomeTagLine-iRolTP bAczAY']"));
            // Assert
            Thread.sleep(3000);
            WebElement header = driver.findElement(By.xpath("//*[contains (text(), 'Top Destinations')]"));
            String text1 = header.getText();
            Assert.assertEquals(text1,  "Top Destinations");

        }

        @Test
        public void signUpClick() throws InterruptedException {
            //Act
            WebElement signUpButton = driver.findElement(By.cssSelector("[href='/register']"));
            signUpButton.click();
            Thread.sleep(3000);
//Assert
            WebElement createAnAccount = driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
            String text = createAnAccount.getText();
            Assert.assertEquals(text, "Create an account");
            Thread.sleep(3000);
//Act
            WebElement placeHolder = driver.findElement(By.cssSelector("[id='username']"));
            placeHolder.clear();
            placeHolder.sendKeys("smarot1000");
            Thread.sleep(3000);

            WebElement email = driver.findElement(By.cssSelector("[id='email']"));
            email.clear();
            email.sendKeys("smarot1000@mail.ru");
            Thread.sleep(3000);

            WebElement password = driver.findElement(By.cssSelector("[id='password']"));
            password.clear();
            password.sendKeys("Line100$#");
            Thread.sleep(3000);

            WebElement register = driver.findElement(By.cssSelector("[class='ui large fluid button green-btn pl-btn']"));
            register.click();
            //Assert


        }

        @Test
        public void createTripButton() throws InterruptedException {
            WebElement createTrip = driver.findElement(By.xpath("//*[contains(text(),'Create Trip')]"));
            createTrip.click();
            //Assert
            Thread.sleep(3000);
            WebElement whereDoYouWant = driver.findElement(By.cssSelector("[class='commonStyles__H2Subtitle-hXjBTD jfqEVh']"));
            String text = whereDoYouWant.getText();
            Assert.assertEquals(text, "Where do you want to go?");

        }

        @Test
        public void earnMoneyButton() throws InterruptedException {
            WebElement earnMoney = driver.findElement(By.xpath("(//*[contains(text(),'Earn Money')])[1]"));
            earnMoney.click();
            //Assert
            Thread.sleep(3000);
            WebElement tripsIn = driver.findElement(By.cssSelector("[class='earn-money__Title-eVsjjP dyDlzj']"));
            String text = tripsIn.getText();
            Assert.assertEquals(text, "Earn Money");

        }


    }


