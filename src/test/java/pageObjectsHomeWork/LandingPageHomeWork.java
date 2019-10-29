package pageObjectsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageHomeWork extends BasePage {


    public LandingPageHomeWork(WebDriver driver) {
        super(driver);
    }

    public void openTestingPage() {
        driver.get("https://deens-master.now.sh");
        System.out.println("Testing page opened");
    }

    private WebElement logInButton() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
    }

    public LogInPageHomeWork openLogInPage() {
        logInButton().click();
        LogInPageHomeWork logInPage = new LogInPageHomeWork(driver);
        return logInPage;
    }

    private boolean getUserAvatarLoginTest() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@alt='user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatarLoginTest();
    }


    public WebElement signUpButton() {
        return wait.until(x -> driver.findElement(By.cssSelector("[href='/register']")));
    }

    public SignUpPageHomeWork openSignUpPageHomeWork() {
        signUpButton().click();
        SignUpPageHomeWork signUpPage = new SignUpPageHomeWork(driver);
        return signUpPage;
    }

    private boolean getUserAvatarSignUpTest() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@alt='user avatar']")).isDisplayed());
    }

    public boolean isRegistered() {
        return getUserAvatarSignUpTest();
    }


    private WebElement earnMoneyButton() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@href='/earn-money']")));
    }

    public EarnMoneyPageHomeWork openEarnMoneyPage(WebDriver driver) {
        wait.until(x -> driver.findElement(By.xpath("(//div[@width='auto'])[2]")));
        earnMoneyButton().click();
        EarnMoneyPageHomeWork earnMoneyPage = new EarnMoneyPageHomeWork(driver);
        return earnMoneyPage;
    }
}
