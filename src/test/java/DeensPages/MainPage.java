package DeensPages;

import hw10.SignUp;
import hw11.EarnMoney;
import hw13.SearchDestination;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageObjects.LoginPage;
import java.time.Duration;

public class MainPage  {
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

    public WebElement openEarnMoneyPage() {
        return wait.until(x->driver.findElement(By.xpath("//*[@href='/earn-money']")));
    }
    public MainPage login(String user, String password) {
        getEmail().sendKeys(user);
        getPassword().sendKeys(password);
        getButton().click();
        return new MainPage(driver);
    }
    private WebElement getEmail() {
        return wait.until(x->x.findElement(By.id("email")));
    }
    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
    }
    private WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }
    public EarnMoney openEarnMoney() {
        getEarnMoney().click();
        return new EarnMoney(driver);
    }
    private WebElement getEarnMoney() {
        return driver.findElement(By.linkText("Earn Money"));
    }
    public SearchDestination open(String new_york) {
        var searchNewYork=driver.findElement(By.name("search"));
        searchNewYork.sendKeys("New York", Keys.RETURN);
        return new SearchDestination(driver);
    }
    }
