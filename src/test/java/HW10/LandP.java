package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.LandingPage;

public class LandP {
    private WebDriver driver;

    public LandP(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignUpButton() {
        var sign=driver.findElement(By.xpath("//*[@href=\"/register\"]"));
        return sign;
    }

    public SignUpPage openSignUpPage() {
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    public void open() {
        driver.get("\"https://deens-master.now.sh/\"");
    }


}
