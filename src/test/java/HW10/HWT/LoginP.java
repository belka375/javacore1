package HW10.HWT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginP extends BasePages {


   public LoginP(WebDriver driver){super (driver);}

   public LandingP login(String user, String password ){
       getUser().sendKeys(user);
       getPsw().sendKeys(password);
       getButton().click();
       return new LandingP(driver);




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
