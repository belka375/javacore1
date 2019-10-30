package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class LoginP {
   private WebDriver driver;
   Wait<WebDriver> wait;

   public LoginP(WebDriver driver){
       this.driver=driver;
       wait = new FluentWait<WebDriver>(driver)
               .withTimeout(Duration.ofSeconds(30))
               .pollingEvery(Duration.ofMillis(200))
               .ignoring(NoSuchElementException.class);
   }
   public void login(String user, String password ){
       getUser().sendKeys(user);
       getPsw().sendKeys(password);
       getButton().click();




   }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[@data-testid=\"loginSubmit\"]"));
    }

    private WebElement getPsw() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getUser() {
        return driver.findElement(By.id("email"));

    }

}
