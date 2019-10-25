package shw10_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MainPage1 {
    private WebDriver driver;
    Wait<WebDriver> fluentWait;


    public MainPage1 (WebDriver driver) {
        this.driver=driver;
        fluentWait= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);

    }



    public void  open(){
        driver.get("https://deens-master.now.sh/");

    }

    public WebElement getSignInButton1(){

        return fluentWait.until(x->driver.findElement(By.xpath("//*[text()='Sign up']")));


    }

    public WebElement openSignUpPage(){

        return fluentWait.until(x->driver.findElement(By.xpath("//*[@href='/register']")));


    }
    public SignUpPage clickOnSignInButton1(){
        getSignInButton1().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }}



