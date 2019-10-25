package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

        private WebDriver driver;
        Wait<WebDriver> wait;

        public HomePage(WebDriver driver){
            this.driver = driver;
            wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(50))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(StaleElementReferenceException.class)
                    .ignoring(Exception.class);

        }

        public void open() {
            driver.get("https://deens-master.now.sh/");
        }

        public WebElement getLoginButton(){
            var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
            return loginButton;
        }
        public LogInPage openLoginPage() {

            getLoginButton().click();
            LogInPage logInPage = new LogInPage(driver);
            return logInPage;
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
            return avatar;
        }
        //hw 10. need to re-do
        public void worldImgDisplayed(){
            var worldImg = wait.until(x->driver.findElement(By.xpath("//img[contains(@src,'world')]")).isDisplayed());
        }
        //hw10. need to re-do
        public void assertAvatar(){
            Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'Avatar')]")).size()==1);
        }

        private boolean isAvatarDisplayed(){
            return getAvatar().isDisplayed();
        }

        public boolean isLogged() {
            return isAvatarDisplayed();
        }

        private WebElement getEarnMoneyButton() {
            return wait.until(x-> driver.findElement(By.xpath("//a[@href='/earn-money']")));
        }

        public EarnMoneyPage openEarnMoneyPage() {
            getEarnMoneyButton().click();
            var earnMoneyPage = new EarnMoneyPage(driver);
            return earnMoneyPage;
        }

    }

