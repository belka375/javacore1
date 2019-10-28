package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class LandingPage extends BasePage {


    public LandingPage(WebDriver driver) {
        super(driver);
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
    public WebElement getLoginButton() {
        var loginButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;


    }

    //search for signUn button
    private WebElement getSignUpButton() {
        var signUpButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/register']")));
        return signUpButton;
    }

    //click to login button
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

    //wait till the moment that avatar be displeed
    private boolean getUserAvatar() {
        return wait.until(x -> driver.findElement(By.cssSelector("[alt='user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();

    }

    private WebElement getEarnMoneyLink() {
        var earnMoneyLink = driver.findElement(By.xpath("//*[text()='Earn Money']"));
        return earnMoneyLink;
    }

    public EarnMoneyPage openEarnMoneyPage() throws IOException, UnsupportedFlavorException {
        getEarnMoneyLink().click();
        EarnMoneyPage earnMoneyPage = new EarnMoneyPage(driver);
        return earnMoneyPage;
    }

    private WebElement getNYCThumb() {
        return driver.findElement((By.xpath("(//*[text()='New York'])[1]")));
    }

    public SearchNYCPage openSearchNYCPage() {
        getNYCThumb().click();
        SearchNYCPage searchNYCPage = new SearchNYCPage(driver);
        return searchNYCPage;
    }

    private boolean getLandedImage() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@class=' lazyloaded']")).isDisplayed());
    }

    public boolean isLanded() {
        return getLandedImage();
    }
}
