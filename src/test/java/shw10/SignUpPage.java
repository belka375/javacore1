package shw10;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;
    FluentWait<WebDriver> wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public MainPage signUpPage(String username, String email, String password) {
        getUserNameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getRegisterButton().click();
        return new MainPage(driver);
    }



    private WebElement getUserNameField() {
//        var getUserNameField=wait.until(x->driver.findElement(By.xpath("//*[@placeholder='Username']")));
//        return driver.findElement(By.xpath("//*[@placeholder='Username']"));

        return wait.until(x->driver.findElement(By.xpath("//*[@placeholder='Username']")));
    }

    private WebElement getEmailField() {
//        var getEmailField=wait.until(x->driver.findElement(By.xpath("//*[@placeholder='E-mail address']")));
//        return driver.findElement(By.xpath("//*[@placeholder='E-mail address']"));

        return wait.until(x->driver.findElement(By.xpath("//*[@placeholder='E-mail address']")));
    }

    private WebElement getPasswordField() {
//        var getPasswordField=wait.until(x->driver.findElement(By.xpath("//*[@placeholder='Password']")));
//        return driver.findElement(By.xpath("//*[@placeholder='Password']"));

        return wait.until(x->driver.findElement(By.xpath("//*[@placeholder='Password']")));
    }

    private WebElement getRegisterButton() {
//        var getRegisterButton=wait.until(x->driver.findElement(By.xpath("//*[text()='Register']")));
//        return driver.findElement(By.xpath("//*[text()='Register']"));

        return wait.until(x->driver.findElement(By.xpath("//*[text()='Register']")));
    }

    
    private boolean getAvatar(){
        return driver.findElement(By.xpath("//*[@alt='user avatar']")).isEnabled();
    }
}
