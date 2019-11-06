package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
     super(driver);

    }

    public LandingPage login(String user, String password) {
        System.out.println("in the login method");
        getEmailField().sendKeys(user);
        System.out.println("send username");
        getPasswordField().sendKeys(password);
        getButton().click();
        return new LandingPage(driver);

    }

    private WebElement getButton() {

        return driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
    }

    private WebElement getPasswordField() {

        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {

        return wait.until(x->x.findElement(By.id("email")));
    }





}
