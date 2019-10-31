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
    public WebElement getBottomButton() throws InterruptedException {
        boolean staleElement = true;
        WebElement button = null;
        while(staleElement){
            try{
                button = driver.findElement(By.xpath("//*[text()='Create a Trip & Start Earning']"));
                staleElement = false;
            } catch(StaleElementReferenceException e){
                staleElement = true;
                Thread.sleep(100);
            }
        }
        return button;
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

    public void openBottomButton() throws InterruptedException{
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        getBottomButton().click();
    }

    private boolean getPopup(){
        try {
            wait.until(x -> driver.findElement(By.xpath("//*[text()='Premium']")));
            return true;
        }catch(TimeoutException x){
            return false;
        }
    }
    public boolean isPopup() {
        return getPopup();
    }
}
