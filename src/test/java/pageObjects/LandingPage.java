package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage {
    private WebDriver driver;

    //WebElement earnMoney = driver.findElement(By.xpath("(//*[text()='Earn Money'])[1]"));

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    public WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("[href='/login']"));
    }
    public LoginPage openLoginPage(){
        getLoginButton().click();
       LoginPage loginPage = new LoginPage(driver);
       return loginPage;
    }
    public WebElement getSignUpButton(){
        return driver.findElement(By.cssSelector("[href='/register']"));
    }
    public SignUpPage openSignUpPage(){
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }


}
