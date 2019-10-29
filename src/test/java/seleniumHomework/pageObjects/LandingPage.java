package seleniumHomework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver){
        super(driver);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    public WebElement getLoginButton(){
        var loginButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/login']")));
        return loginButton;
    }
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    public WebElement getSignUpButton(){
        WebElement signUpButton = wait.until(x->driver.findElement(By.cssSelector("a[href*='/register']")));
        return signUpButton;
    }

    public SignUpPage openSignUpPage(){
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }

    public WebElement getEarnMoneyPageButton(){ return wait.until(x->driver.findElement(By.cssSelector("a[href*='earn-money']"))); }


    public EarnMoneyPage openEarnMoneyPage(){
        wait.until(x->x.findElements(By.cssSelector(".DesktopDropDownMenu__AvatarWrapper-gadyKq.gCRuJP")).size()==1);
        getEarnMoneyPageButton().click();
        EarnMoneyPage earnMoneyPage = new EarnMoneyPage(driver);
        wait.until(x->x.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/main/div[1]/div/div/div/div/div[1]/div/input")));
        return earnMoneyPage;
    }

    public WebElement getCityInput(){
        return wait.until(x->x.findElement(By.cssSelector(".HomeSearch__Input-kuDdmy.dEnusz")));
    }

    public NewYorkToursPage openNewYorToursPage(){
        getCityInput().sendKeys("New York"+ Keys.ENTER);
        NewYorkToursPage newYorkPage = new NewYorkToursPage(driver);
        wait.until(x->x.findElement(By.cssSelector(".Trip__LinkWrapper-fulyrM.ewiHv")));
        return newYorkPage;
    }

    public NewYorkToursPage openNewYorToursPageByChousingFirstElement(){
        getCityInput().sendKeys("New York"+ Keys.ENTER);
        wait.until(x->x.findElements(By.xpath("//*[@role='combobox'][1]")));
        NewYorkToursPage newYorkPage = new NewYorkToursPage(driver);
        wait.until(x->x.findElement(By.cssSelector(".Trip__LinkWrapper-fulyrM.ewiHv")));
        return newYorkPage;
    }

    public WebElement getcreateTripAndStarErningButton(){
        return wait.until(x->driver.findElement(By.xpath("//*[contains(text(),'Create a Trip & Start Earning')]")));
    }
}