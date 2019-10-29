package shomework13.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.EarnMoneyPage;


public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    private WebElement getLoginButton() {
        var loginButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
    }

    private WebElement getEarnMoney() {
        return driver.findElement(By.linkText("Earn Money"));
    }

    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    private WebElement getSignUpButton() {
        var signUpButton = wait.until(x -> driver.findElement(By.cssSelector("[href='/register']")));
        return signUpButton;
    }

    public SignUpPage openSignUpPage() {
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    private boolean getUserAvatar() {
        return wait.until(x -> driver.findElement(By.cssSelector("[alt = 'user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();
    }

    public EarnMoneyPage openEarnMoneyPage() {
        getEarnMoney().click();
        return new EarnMoneyPage(driver);
    }

    private WebElement getSearchTripsField() {
        return wait.until(x -> driver.findElement(By.cssSelector(".dEnusz")));
    }

    public void openNewYorkPage() throws InterruptedException {
        getSearchTripsField().sendKeys(" New York, NY, USA");
        Thread.sleep(2000);
        getSearchTripsField().sendKeys(Keys.ENTER);
    }

}
