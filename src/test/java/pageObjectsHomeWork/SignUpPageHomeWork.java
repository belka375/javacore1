package pageObjectsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageHomeWork extends BasePage {

    public SignUpPageHomeWork(WebDriver driver) {
        super(driver);
    }

    public LandingPageHomeWork signUpNewUser(String username, String userEmail, String userPassword) {
        getUsernameInputField().sendKeys(username);
        getEmailInputField().sendKeys(userEmail);
        getPasswordInputField().sendKeys(userPassword);
        getRegisterButton().click();
        return new LandingPageHomeWork(driver);
    }

    private WebElement getUsernameInputField() {
        return wait.until(x -> driver.findElement(By.id("username")));
    }

    private WebElement getEmailInputField() {
        return driver.findElement(By.id("email"));
    }

    private WebElement getPasswordInputField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getRegisterButton() {
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }
}
