package homeWork11_pageObjects_Deens;

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
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(Exception.class);
    }

    public void login(String user, String password) {
        getEmailField().sendKeys(user);
        getPasswordField().sendKeys(password);
        getButton().click();
    }

    private WebElement getEmailField() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@id='email']")));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.xpath("//*[@id='password']"));
    }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
    }

}
