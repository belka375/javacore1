package shomework14.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.EarnMoneyPage;


public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    private WebElement getLoginButton() {
        var loginButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
    }

    private WebElement getEarnMoney() {
        return driver.findElement(By.linkText("Earn Money"));
    }

    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    private WebElement getSignUpButton() {
        var signUpButton = wait.until(x -> driver.findElement(By.cssSelector("[href='/register']")));
        return signUpButton;
    }

    public SignUpPage openSignUpPage() {
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    private boolean getUserAvatar() {
        return wait.until(x -> driver.findElement(By.cssSelector("[alt = 'user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();
    }

    public EarnMoneyPage openEarnMoneyPage() {
        getEarnMoney().click();
        return new EarnMoneyPage(driver);
    }

   public DestinationPage open(String destination){
        var city = driver.findElement(By.xpath("//h1[text()='"+destination+"']"));
        city.click();
        return new DestinationPage(driver);
   }

    public void openNewTrip() {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        var createTrip=driver.findElement(By.cssSelector("div>a>p"));
        createTrip.click();
    }

     public WebElement getNewTripWindow(){
         return driver.findElement(By.cssSelector("[style='margin-bottom: 30px;']"));
     }
}
