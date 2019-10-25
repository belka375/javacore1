package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
    }

    public void login(String user, String passord) {
        //fill the field and click to the button login
        System.out.println("in the login method");
        getEmailField().sendKeys(user);
        System.out.println("send username");
        getPassordField().sendKeys(passord);
        getButton().click();
    }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
    }

    private WebElement getPassordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {
        return wait.until(x->driver.findElement(By.id("email")));

    }

    public LandingPage loginGood(String user, String password) {
        getEmailField().sendKeys("useras");
        getPassordField().sendKeys("mailinator");
        getButton().click();
        return new LandingPage(driver);
    }



}
