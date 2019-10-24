package sel_hw10yp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
//    Wait<WebDriver> wait;
    public LandingPage(WebDriver driver){
        this.driver = driver;
//            wait = new FluentWait<WebDriver>(driver)
//                    .withTimeout(Duration.ofSeconds(30))
//                    .pollingEvery(Duration.ofMillis(100))
//                    .ignoring(Exception.class);
        }
//Создали конструктор открыть страницу. Метод ничего не возвращает
    public void open() {
        driver.get("https://deens-master.now.sh/");
        }

// Создаем конструктор для открытия страницы регистрации
    public WebElement getSignupButton(){
        var signupButton = driver.findElement(By.xpath("//*[@href='/register']"));
        return signupButton;
//        var signupButton = wait.until(x->driver.findElement(By.xpath("//*[@href='/register']")));
    }

    public SignUpPage openSignUpPage() {
        getSignupButton().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
//        тут мы создаем переменную нового класса и отдаем ей паметр - создаем класс SignUpPage
    }

}
