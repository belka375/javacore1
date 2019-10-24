package sel_hw10yp.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class SignUpPage {
    private  WebDriver driver;
    FluentWait<WebDriver> wait;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

    }

    public void register(String username, String email, String password) {
        getUsernameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getButton().click();
    }

    private WebElement getButton() {
//        return driver.findElement(By.cssSelector("button.green-btn.pl-btn"));
        return wait.until(x->x.findElement(By.cssSelector("button.green-btn.pl-btn")));
    }

    private WebElement getPasswordField() {
        return wait.until(x->x.findElement(By.id("password")));
    }

    private WebElement getEmailField() {
//        return driver.findElement(By.id("email"));
//        вставляем wait
        return wait.until(x->x.findElement(By.id("email")));
    }

    private WebElement getUsernameField() {
//        return driver.findElement(By.id("username"));
        return wait.until(x->x.findElement(By.id("username")));
    }

}
