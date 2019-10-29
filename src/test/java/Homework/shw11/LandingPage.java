package Homework.shw11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
    Wait<WebDriver> wait;
    public LandingPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    private WebElement getLoginButton(){
        var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
    }

    private WebElement getEarnMoney(){
        return driver.findElement(By.linkText("Earn Money"));
    }

    public LoginPage openLoginPage() {

        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    private boolean getUserAvatar(){
        return wait.until(x->driver.findElement(By.cssSelector("[alt = 'user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();
    }

    public EarnMoneyPage openEarnMoneyPage() {
        getEarnMoney().click();
        return new EarnMoneyPage(driver);
    }

}