package sel_hw11yp;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.security.PublicKey;
import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public LandingPage(WebDriver driver) {
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

    private WebElement getLoginButton() {
        var loginButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
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

//    public WebElement getAvatar() {
//        var avatar = wait.until(x -> driver.findElement(By.xpath("//div[contains(@class,'Avatar')]")));
//        return avatar;
//    }
//    public void assertAvatar(){
//        Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'Avatar')]")).size()==1);
//    }
//
//    private boolean isAvatarDisplayed(){
//        return getAvatar().isDisplayed();
//    }
//
//    public boolean isLogged() {
//        return isAvatarDisplayed();
//    }

    private WebElement getEarnMoneyLink(){
       return wait.until(x->driver.findElement(By.cssSelector("[href='/earn-money']")));
    }

    public EarnMoneyPage openEarnMoneyPage (WebDriver driver) {
        wait.until(x -> driver.findElement(By.xpath("(//div[@width='auto'])[2]")));
        getEarnMoneyLink().click();
        EarnMoneyPage earnMoneyPage = new EarnMoneyPage(driver);
        return earnMoneyPage;
    }
}