package hw7_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Work {



    WebElement logo =driver.findElement(By.cssSelector("[src='/logo.svg']"));
    WebElement earnMoney = driver.findElement(By.cssSelector("[href='/earn-money']"));
    WebElement createTrip = driver.findElement(By.cssSelector("[data-testid='createTripHeaderButton']"));
    WebElement login = driver.findElement(By.cssSelector("[href='/login']"));
    WebElement signUp = driver.findElement(By.cssSelector("[href='/register'"));
    WebElement picture = driver.findElement(By.cssSelector("login-img"));
    WebElement logInToYourAccount = driver.findElement(By.cssSelector("login-header"));
    WebElement email = driver.findElement(By.cssSelector("#email"));
    WebElement password = driver.findElement(By.cssSelector("#password"));
    WebElement logIn = driver.findElement(By.cssSelector("pl-btn"));
    WebElement signUp1 = driver.findElement(By.cssSelector("[href='/register']"));
    WebElement forgotPassword = driver.findElement(By.cssSelector("[href='/recover-password']"));
    WebElement planYourNextTrip = driver.findElement(By.cssSelector("login-img-content"));

}
