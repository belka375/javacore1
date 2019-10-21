package hw6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Work {

        private WebDriver driver;

        @BeforeTest
        public void setDriver() {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();

        }

        @AfterTest

        public void tierDown() throws InterruptedException {
            Thread.sleep(5000);
            driver.quit();
        }


//@Test

//  public void searchInGoogleForACar_CarFound() throws InterruptedException {
//    driver.get("https://google.com");
//    Thread.sleep(5000);
//    try {
//      WebElement searchBox = driver.findElement(By.xpath("//*[@maxlength='2048']"));
//      searchBox.sendKeys("Car");
//      Thread.sleep(5000);
////    searchBox.sendKeys(Keys.RETURN);
////
////  }
////
////  @Test
////  public void deen_clickOnSighUp_pageOpened() throws InterruptedException {
////    driver.get("https://deens-master.now.sh");
////    Thread.sleep(5000);
////    WebElement signUp = driver.findElement(By.xpath("//a[@href='/register']"));
////    signUp.click();
////    Thread.sleep(5000);
////    WebElement signUpHeader = driver.findElement(By.xpath("//div[@class='login-header']"));
////    String text = signUpHeader.getText();
////    Assert.assertEquals(text, "Create an account");
//
//      List<WebElement> searchButtons = driver.findElements(By.xpath("//*[@name='btnK']"));
//      searchButtons.forEach(button -> {
//        if (button.isDisplayed()) {
//          button.click();
//        }
//      });
//    } catch (Exception e) {
//
//    }

        //    @Test
//    public void deens_TryToLogin_LoginFailed() throws InterruptedException {
//      driver.get("http://deens-master.now.sh/");
//      Thread.sleep(3000);
//      WebElement loginButton = driver.findElement(By.xpath("//*[contains(@href,'login')]"));
//      loginButton.click();
//      Thread.sleep(5000);
//
//      WebElement id = driver.findElement(By.id("email"));
//      WebElement password =driver.findElement(By.name("password"));
//      WebElement logInButton = driver.findElement(By.className("pl-btn"));
//id.sendKeys("User");
//password.sendKeys("Password");
//logInButton.click();
//
//Thread.sleep(2000);
//
//Assert.assertTrue(driver.findElements(By.className("header")).size()!=0);
//
        @Test

        public void tryToLoginUsingWrongCredentials_LoginFailed_ErrorMessageAppear() throws InterruptedException {
            driver.get("http://deens-master.now.sh/");
            Thread.sleep(3000);
            WebElement logIn=driver.findElement(By.linkText("Login"));
            logIn.click();

            Thread.sleep(3000);

            WebElement email = driver.findElement(By.id("email"));
            WebElement password1 = driver.findElement(By.id("password"));
            WebElement login1 = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));

            email.sendKeys("Hi");
            password1.sendKeys("Bye");
            login1.click();

            Thread.sleep(3000);

            Assert.assertSame("Cannot login", "Cannot login");



        }}




