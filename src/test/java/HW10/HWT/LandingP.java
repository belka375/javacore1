package HW10.HWT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingP extends BasePages{


    public LandingP(WebDriver driver){super(driver);
            }

    public void openLP() {
        driver.get("https://deens-master.now.sh/login");

    }
    public WebElement getSignUP(){
        return wait.until(x->x.findElement(By.xpath("//*[@href=\"/register\"]")));
    }

    public SignUpPage openSignUpPage() {
        getSignUP().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        return signUpPage;

    }

    public LoginP openLoginP() {
       getLoginButton().click();
       LoginP loginP=new LoginP(driver);
        return loginP;
    }

    private WebElement getLoginButton() {
        return wait.until(x->x.findElement(By.xpath("//*[@href='/login']")));
    }

    public EarnMoneyP openEM(){
        getEarnMoneyB().click();
        EarnMoneyP earnMoneyP=new EarnMoneyP(driver);

        return earnMoneyP;

    }

    private WebElement getEarnMoneyB() {
        return wait.until(x->x.findElement(new By.ByLinkText("Earn Money")));
    }



    public SearchResults open(String city) {
         var cities =driver.findElement(By.xpath("//h1[text()='"+city+"']"));
         cities.click();
         return new SearchResults(driver);
    }
}

