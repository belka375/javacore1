package shw10.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.security.SecureRandom;
import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    public void loginWithRandomCredantials(int loginNameLangth, int emailLnagth,int passwordLangh) {
        wait.until(x->x.findElements(By.id("username")).size()==1);
        getUserNameField().sendKeys(randomString(loginNameLangth));
        getEmailField().sendKeys(randomString(emailLnagth)+"@gmail.com");
        getPasswordField().sendKeys(randomString(passwordLangh));
        getSignUpButton().click();
    }

    private WebElement getUserNameField() { return driver.findElement(By.id("username")); }
    private WebElement getEmailField() {return driver.findElement(By.id("email"));}
    private WebElement getPasswordField() {return driver.findElement(By.id("password")); }
    private WebElement getSignUpButton(){return driver.findElement(By.cssSelector(".ui.large.fluid.button.green-btn.pl-btn"));}

    public void assertlogin(){
        Assert.assertTrue(wait.until(x->x.findElements(By.cssSelector(".DesktopDropDownMenu__AvatarWrapper-gadyKq.gCRuJP")).size()==1));
    }


}
