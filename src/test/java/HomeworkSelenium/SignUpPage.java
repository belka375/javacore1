package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPage {

    private WebDriver driver;
    Wait<WebDriver> wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    public void signUp(String username, String email, String password) {

        getUsernameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getRegisterButton().click();
    }

    private WebElement getRegisterButton() {
        return driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
    }
//  wait needed before the first element/field
//    private WebElement getUsernameField() {
//        return driver.findElement(By.id("username"));
//    }

    private WebElement getUsernameField() {return wait.until(x->driver.findElement(By.id("username")));}
//        return driver.findElement(By.id("username"));

    private WebElement getPasswordField() {return driver.findElement(By.id("password"));}

//    we only need wait for the first field/element, which is username
//    private WebElement getEmailField() {return wait.until(x->x.findElement(By.id("email")));}
    private WebElement getEmailField() {return driver.findElement(By.id("email"));}

}