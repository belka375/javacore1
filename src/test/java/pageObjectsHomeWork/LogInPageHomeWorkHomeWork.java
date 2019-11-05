package pageObjectsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageHomeWorkHomeWork extends BasePageHomeWork {


    public LogInPageHomeWorkHomeWork(WebDriver driver) {
        super(driver);
    }

    public void logInRegisteredUser(String userEmail, String userPassword) {
        getEmailInputField().sendKeys(userEmail);
        getPasswordInputField().sendKeys(userPassword);
        getLogInButton().click();
    }

    private WebElement getEmailInputField() {
        return wait.until(x -> driver.findElement(By.cssSelector("[name='email']")));
    }

    private WebElement getPasswordInputField() {
        return driver.findElement(By.cssSelector("[name='password']"));
    }

    private WebElement getLogInButton() {
        return driver.findElement(By.cssSelector("[data-testid='loginSubmit']"));
    }

    private WebElement searchInputField() {
        return wait.until(x -> driver.findElement(By.cssSelector("input[type='text']")));
    }

    public void searchForTrip(String search) {
        searchInputField().sendKeys(search + Keys.ENTER);
        //searchInputField().sendKeys(Keys.RETURN);
    }

    public SearchPageHomeWorkHomeWork openSearchPage(WebDriver driver) {
        wait.until(x -> driver.findElement(By.cssSelector(".Trip__LinkWrapper-fulyrM.ewiHv")));

        SearchPageHomeWorkHomeWork searchPage = new SearchPageHomeWorkHomeWork(driver);
        return searchPage;

    }
}
