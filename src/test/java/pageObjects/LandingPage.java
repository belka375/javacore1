package pageObjects;

import org.openqa.selenium.*;

public class LandingPage extends BasePage{
    public LandingPage(WebDriver driver){
        super(driver);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    private WebElement getLoginButton(){
        var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
    }

    private WebElement getEarnMoney(){
        return driver.findElement(By.linkText("Earn Money"));
    }
    public LoginPage openLoginPage() {

        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    private WebElement getSignUpButton(){
        var signUpButton = wait.until(x->driver.findElement(By.cssSelector("[href='/register']")));
        return signUpButton;
    }
    public SignUpPage openSingUpPage() {
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    private boolean getUserAvatar(){
        return wait.until(x->driver.findElement(By.cssSelector("[alt = 'user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();
    }

    public EarnMoneyPage openEarnMoneyPage() {
        getEarnMoney().click();
        return new EarnMoneyPage(driver);
    }
    public DestinationPage open(String destination) {
        var city = driver.findElement(By.xpath("//h1[text()='"+destination+"']"));
        city.click();
        return new DestinationPage(driver);
    }
}
