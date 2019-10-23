package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.security.auth.login.LoginContext;
import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
    Wait<WebDriver> wait;
   // private WebElement earnMoney = driver.findElement(By.xpath("(//*[text()='Earn Money'])[1]"));

    public LandingPage(WebDriver driver){
        this.driver=driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
    }

  //  public WebElement getEarnMoney() {
 //       return earnMoney;
 //   }
    //method for click to earn money
  //  public void clickEarnMoney(){
  //      getEarnMoney().click();
  //  }

    public void open() {
        driver.get("https://deens-master.now.sh/");

    }
    //search login button
    public WebElement getLoginButton(){
        var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;


    }
    //search for signUn button
    public WebElement getSignUpButton(){
        var signUpButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/register']")));
        return signUpButton;
    }
//click to ligin button
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;

    }
  //click to SignUp button
    public SignUpPage openSignUpPage() {
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }
}
