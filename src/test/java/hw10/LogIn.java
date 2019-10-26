package hw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class LogIn {
    private WebDriver driver;
    Wait<WebDriver> wait;
    public void logIn(String user, String password) {
        getEmail().sendKeys(user);
        getPassword().sendKeys(password);
        getButton().click();
    }
    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
    }
    private WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }
    private WebElement getEmail() {
        return wait.until(x->x.findElement(By.id("email")));
    }
}
