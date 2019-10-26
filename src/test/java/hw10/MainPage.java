package hw10;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageObjects.LoginPage;

import java.time.Duration;


public class MainPage {
    private WebDriver driver;
    Wait<WebDriver> wait;
    public MainPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }
    public void open() {
        driver.get("https://deens-master.now.sh/");
    }
    private WebElement getLoginButton(){
        var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
    }
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }
    private WebElement getSignUpButton(){
        var signUpButton = wait.until(x->driver.findElement(By.cssSelector("[href='/register']")));
        return signUpButton;
    }
    public SignUp openSingUp() {
        getSignUpButton().click();
        SignUp signUp = new SignUp(driver);
        return signUp;
    }
    private boolean getUserAvatar(){
        return wait.until(x->driver.findElement(By.cssSelector("[alt = 'user avatar']")).isDisplayed());
    }
    public boolean isLogged() {
        return getUserAvatar();
    }
}
