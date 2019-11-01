package HW10.HWT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePages{

    public SignUpPage(WebDriver driver){super(driver);

    }

    public void signup(String user, String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getButton().click();
        getUserField().sendKeys(user);
    }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }

    private WebElement getUserField() {
        return driver.findElement(By.id("username"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {
       return wait.until(x->x.findElement(By.id("email")));
    }
}
