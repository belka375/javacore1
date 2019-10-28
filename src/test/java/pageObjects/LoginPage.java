package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
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
        getEmailField().sendKeys(user);
        getPassordField().sendKeys(password);
        getButton().click();
        return new LandingPage(driver);
    }



}
