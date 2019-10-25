package shw10.pageObjects;

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
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(200))
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
        WebElement signUpButton = wait.until(x->driver.findElement(By.cssSelector("a[href*='/register']")));
        return signUpButton;
    }

    public SignUpPage openSignUpPage(){
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    public WebElement getEarnMoneyPageButton(){ return wait.until(x->driver.findElement(By.cssSelector("a[href*='earn-money']"))); }


    public EarnMoneyPage openEarnMoneyPage(){
        wait.until(x->x.findElements(By.cssSelector(".DesktopDropDownMenu__AvatarWrapper-gadyKq.gCRuJP")).size()==1);
        getEarnMoneyPageButton().click();
        EarnMoneyPage earnMoneyPage = new EarnMoneyPage(driver);
        wait.until(x->x.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/main/div[1]/div/div/div/div/div[1]/div/input")));
        return earnMoneyPage;
    }
}