package shomework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

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

    public int randomInt(){
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(1000);
        return randomNumber;
    }
    public void signup(String username, String email, String password){
        getUsernameField().clear();
        getUsernameField().sendKeys(username + randomInt());
        getEmailField().clear();
        getEmailField().sendKeys(email);
        getPasswordField().clear();
        getPasswordField().sendKeys(password+randomInt());
        getButton().click();
        wait.until(x -> x.findElement(By.xpath("//*[@src='/world.png']")));
    }

    private WebElement getButton() {
        return driver.findElement(By.cssSelector("[class*='pl-btn']"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.cssSelector("#password"));
    }

    private WebElement getEmailField() {
        return driver.findElement(By.cssSelector("#email"));
    }

    private WebElement getUsernameField() {
        return wait.until(x->x.findElement(By.cssSelector("#username")));
    }

}
