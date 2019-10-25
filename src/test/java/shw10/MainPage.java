package shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class MainPage {
    FluentWait<WebDriver> wait;

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }
    public void open(){
        driver.get("https://deens-master.now.sh/");

    }
    public WebElement getSignUpButton(){
//        var getSignButton=wait.until(x->driver.findElement(By.xpath("//*[@href='/register']")));
//        return driver.findElement(By.xpath("//*[@href='/register']"));

        return wait.until(x->driver.findElement(By.xpath("//*[@href='/register']")));
    }

    public SignUpPage openSignUpPage() {
        getSignUpButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;


    }

}