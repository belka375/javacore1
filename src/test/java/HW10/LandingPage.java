package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class LandingPage {
    private WebDriver driver;
    Wait<WebDriver>wait;




    public LandingPage(WebDriver driver){
        this.driver=driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }

    public void open() {
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
}

