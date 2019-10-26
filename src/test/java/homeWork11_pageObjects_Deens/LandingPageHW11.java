package homeWork11_pageObjects_Deens;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LandingPageHW11 {
    private WebDriver driver;
    Wait<WebDriver> wait;


    public LandingPageHW11(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }

    //open home page
    public void open() {
        driver.get("https://deens-master.now.sh");
    }

    //create web element login button
    public WebElement getLoginButton() {
        var loginButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;

    }

    //open login page
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    private boolean getUserAvatar() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@alt='user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();
    }


    private WebElement getEarnMoneyButton() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@href='/earn-money']")));
    }

    public EarnMoneyPage openEarnMoneyPage(WebDriver driver) {
        wait.until(x -> driver.findElement(By.xpath("(//div[@width='auto'])[2]")));
        getEarnMoneyButton().click();
        EarnMoneyPage earnMoneyPage = new EarnMoneyPage(driver);
        return earnMoneyPage;

    }


}
