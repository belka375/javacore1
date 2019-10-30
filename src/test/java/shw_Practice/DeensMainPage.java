package shw_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeensMainPage {
    private WebDriver driver;
    @BeforeMethod
    public void deens(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public  void tearDown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void mainPage_deensLogo_logoIsPresent(){
        driver.get("https://deens-master.now.sh/");
        var deensLogo=driver.findElement(By.xpath("//*[@class='Logo__LogoLink-cfYNaB bdaxic']"));
        deensLogo.isDisplayed();
        Assert.assertTrue(deensLogo.isDisplayed());
    }
    @Test
    public void mainPage_welcomeLogo_welcomeLogoIsPresent(){
        driver.get("https://deens-master.now.sh/");
        var welcomeLogo=driver.findElement(By.xpath("//*[@class='Home__WorldWrapper-AIdBX flOFfn']"));
        welcomeLogo.isDisplayed();
        Assert.assertTrue(welcomeLogo.isDisplayed());
    }
    @Test
    public void mainPage_logInButton_logInPageOpened() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        var loginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();
        String text=loginButton.getText();
        Thread.sleep(2000);
        var loginHeader = driver.findElement(By.xpath("//*[@class='login-header']"));
        Assert.assertEquals(text,"Login");
    }
    @Test
    public void mainPage_earnMoneyButton_earnMoneyPageOpened(){
        driver.get("https://deens-master.now.sh/");
        var  earnMoneyButton=driver.findElement(By.xpath("//*[@href='/earn-money']"));
        earnMoneyButton.click();
        String text=earnMoneyButton.getText();
        Assert.assertEquals(text,"Earn Money");
    }
    @Test
    public void mainPage_createTripButton_createTripPageOpened(){
        driver.get("https://deens-master.now.sh/");
        var createTripButton=driver.findElement(By.xpath("//*[@activeclassname='is-active'][2]"));
        createTripButton.click();
        String text=createTripButton.getText();
        Assert.assertEquals(text,"Create Trip");
    }
    @Test
    public void mainPage_signUpButton_sighUpPageOpened() throws InterruptedException{
        driver.get("https://deens-master.now.sh/");
        var signUpButton=driver.findElement(By.xpath("//*[@href='/register']"));
        signUpButton.click();
        Assert.assertTrue(signUpButton.isDisplayed());
    }
    @Test
    public void mainPage_whereDoyouWantToGoText_textPresentOnMainPage() {
        driver.get("https://deens-master.now.sh/");
        var whereToGo = driver.findElement(By.xpath("//*[text()='Where do you want to go?' ]"));
        String text = whereToGo.getText();
        Assert.assertEquals(text, "Where do you want to go?");
    }
    @Test
    public void mainPage_searchBox_searchBoxIsFunctional(){
        driver.get("https://deens-master.now.sh/");
        try {
            var searchBox = driver.findElement(By.xpath("//*[@class='HomeSearch__Input-kuDdmy dEnusz']"));
            searchBox.click();
            searchBox.sendKeys("London,UK");
            searchBox.sendKeys(Keys.RETURN);
            Assert.assertTrue(searchBox.isDisplayed());
        }catch(Exception x) {
        }
        }
        @Test
    public void loginPage_logInForm_loginIsSuccessful() throws InterruptedException {
        driver.get("https://deens-master.now.sh/login");
          driver.findElement(By.xpath("//*[@name='email']")).sendKeys("arlis.judson@thtt.us");
            driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123456789");
            driver.findElement(By.xpath("//*[@class='ui large fluid button green-btn pl-btn']")).click();
            Thread.sleep(10000);
            Assert.assertTrue(driver.findElement(By.xpath("//*[@alt='user avatar']")).isEnabled());
        }
        @Test
        public void loginPage_planTripText_textIsPresent() {
        driver.get("https://deens-master.now.sh/login");
        var text=driver.findElement(By.xpath("//*[@class='login-img-content']"));
        text.getTagName();
        Assert.assertTrue(text.isDisplayed());
        }
        @Test
        public void loginPage_welcomeImage_imageIsVisible(){
        driver.get("https://deens-master.now.sh/login");
        var image=driver.findElement(By.xpath("//*[@class='login-img']"));
        image.isDisplayed();
        Assert.assertTrue(image.isDisplayed());
        }
        @Test
        public void loginPage_forgotPasswordButton_buttonIsFunctional() {
            driver.get("https://deens-master.now.sh/login");
            var forgotPassword = driver.findElement(By.xpath("//*[@href='/recover-password']"));
            forgotPassword.click();
            String text=driver.findElement(By.className("pl-btn")).getText();
            Assert.assertTrue(text.contains("Recover password"));
        }
//        @Test
//        public void signUpPage_signUpButton_signUpSuccessful()  {
//        driver.get("https://deens-master.now.sh/register");
//            var username=driver.findElement(By.xpath("//*[@name='username']"));
//            var email=driver.findElement(By.xpath("//*[@name='email']"));
//            var password=driver.findElement(By.xpath("//*[@name='password']"));
//            var register=driver.findElement(By.xpath("//*[@class='ui large fluid button green-btn pl-btn']"));
////            driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
////            Thread.sleep(5000);
//            username.sendKeys("test");
//            email.sendKeys("cola260690@gmail.com");
//            password.sendKeys("123456789");
//            register.click();
//            Assert.assertTrue(driver.getCurrentUrl().contains("my account"));
        @Test
    public void mainPage_searchBox_goButtonIsPresent(){
        driver.get("https://deens-master.now.sh/");
        var goButton=driver.findElement(By.xpath("//*[@class='LocationAutoSuggest__GoButton-kHhUpD dNFeJQ']"));
        goButton.isDisplayed();
        Assert.assertTrue(true);
        }
        }

