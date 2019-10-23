package Hw10SeleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import pageObjects.LoginPage;

import java.time.Duration;

public class HomePage {

        private WebDriver driver;
        Wait<WebDriver> wait;

        public HomePage(WebDriver driver){
            this.driver = driver;
            wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(Exception.class);
        }

        public void open() {
            driver.get("https://deens-master.now.sh/");
        }

        public WebElement getLoginButton(){
            var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
            return loginButton;
        }
        public LoginPage openLoginPage() {

            getLoginButton().click();
            LoginPage loginPage = new LoginPage(driver);
            return loginPage;
        }

        public WebElement getSignUpButton(){
            var signUpButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/register']")));
            return signUpButton;
        }

        public SignUpPage openSignUpPage(){

            getSignUpButton().click();
            SignUpPage signUpPage = new SignUpPage(driver);
            return signUpPage;
        }

        public WebElement getAvatar(){
            var avatar = wait.until(x->driver.findElement(By.xpath("//div[contains(@class,'Avatar')]")));
            return getAvatar();
        }

        public void worldImgDisplayed(){
            var worldImg = wait.until(x->driver.findElement(By.xpath("//img[contains(@src,'world')]")).isDisplayed());
        }

        public void assertAvatar(){
            Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'Avatar')]")).size()==1);
        }
    }

