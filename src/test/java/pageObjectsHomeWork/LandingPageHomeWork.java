package pageObjectsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public SearchPageHomeWork openSearchPage(String destination) {
        var city = driver.findElement(By.xpath("//h1[text()='" + destination + "']"));
        city.click();
        return new SearchPageHomeWork(driver);
    }

    WebElement craeteTripButton() {
        return driver.findElement(By.xpath("(//*[@*='/new/trip'])[2]"));
    }

    public void scrollDownPage() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", craeteTripButton());
        craeteTripButton().click();
    }

    public boolean whereDoYouWantToGo_Message() {
        return wait.until(x -> driver.findElement(By.cssSelector("[class$='jmrRAj']"))).isDisplayed();
    }

    public boolean messageDisplayed() {
        return whereDoYouWantToGo_Message();
    }
}

