package homework.shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
    Wait<WebDriver>wait;

    //constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(50))
                .ignoring(Exception.class);

    }
    public void open(){
        driver.get("https://deens-master.now.sh/");
    }
    //getter
    public WebElement getSignUpButton(){
        var signUpButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/register']")));
        return signUpButton;
    }

    public SignUpPage openSignUpPage(){
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }


}
