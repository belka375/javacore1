package DeensPages;

import hw10.SignUp;
import hw11.EarnMoney;
import hw13.SearchDestination;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageObjects.LoginPage;
import java.time.Duration;
import static org.openqa.selenium.By.*;

public class MainPage  {
    private WebDriver driver;
    Wait<WebDriver> wait;
    public MainPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }
    public void open() {
        driver.get("https://deens-master.now.sh/");
    }
    private WebElement getLoginButton(){
        var loginButton = wait.until(x->driver.findElement(xpath("//*[@href='/login']")));
        return loginButton;
    }
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }
    private WebElement getSignUpButton(){
        var signUpButton = wait.until(x->driver.findElement(cssSelector("[href='/register']")));
        return signUpButton;
    }
    public SignUp openSingUp() {
        getSignUpButton().click();
        SignUp signUp = new SignUp(driver);
        return signUp;
    }
    private boolean getUserAvatar(){
        return wait.until(x->driver.findElement(cssSelector("[alt = 'user avatar']")).isDisplayed());
    }
    public boolean isLogged() {
        return getUserAvatar();
    }

    public WebElement openEarnMoneyPage() {
        return wait.until(x->driver.findElement(xpath("//*[@href='/earn-money']")));
    }
    public MainPage login(String user, String password) {
        getEmail().sendKeys(user);
        getPassword().sendKeys(password);
        getButton().click();
        return new MainPage(driver);
    }
    private WebElement getEmail() {
        return wait.until(x->x.findElement(id("email")));
    }
    public WebElement getButton() {
        return driver.findElement(xpath("//*[@data-testid='loginSubmit']"));
    }
    private WebElement getPassword() {
        return driver.findElement(id("password"));
    }
    public EarnMoney openEarnMoney() {
        getEarnMoney().click();
        return new EarnMoney(driver);
    }
    private WebElement getEarnMoney() {
        return driver.findElement(linkText("Earn Money"));
    }
    public SearchDestination open(String new_york) {
        var searchNewYork=driver.findElement(name("search"));
        searchNewYork.sendKeys("New York", Keys.RETURN);
        return new SearchDestination(driver);
    }

    public void scrollToButton() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",clickButton());
        clickButton().click();
    }
    public WebElement clickButton(){
       var button=driver.findElement(By.xpath("//*[contains(text(),'Create a Trip & Start Earning')]"));
       return button;
    }
}

