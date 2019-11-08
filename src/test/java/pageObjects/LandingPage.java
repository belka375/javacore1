package pageObjects;

import org.openqa.selenium.*;


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

    private WebElement getEarnMoney(){
        return driver.findElement(By.cssSelector("[activeclassname='is-active]"));
    }
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;


    }

    public WebElement getBottomButton(){
        return wait.until(x->driver.findElement(By.xpath("//*[contains(text(),'Start Earning')]")));
    }
    private boolean getUserAvatar(){
        return wait.until(x-> driver.findElement(By.cssSelector("[alt='user avatar']")).isDisplayed());
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

    public void openBottomoButton() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        getBottomButton().click();
    }

    private boolean getPopUp(){
        try{
            wait.until(x->driver.findElement(By.xpath("//*[text()='PREMIUM']")));
            return true;
        }catch(TimeoutException x){
            return false;
        }
    }
    public boolean isPopUp() {
        return  getPopUp();

    }
}
