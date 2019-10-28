package seleniumHomework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LandingPage loginManualInput(String Username, String Password) {
        getEmailField().sendKeys(Username);
        getPasswordField().sendKeys(Password);
        getLoginButton().click();
        LandingPage landingPage = new LandingPage(driver);
        return landingPage;
    }

    private WebElement getLoginButton() {
        return wait.until(x->driver.findElement(By.xpath("//*[@data-testid='loginSubmit']")));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {
        return wait.until(x->x.findElement(By.id("email")));
    }
}
