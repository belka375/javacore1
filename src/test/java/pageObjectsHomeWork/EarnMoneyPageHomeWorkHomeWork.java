package pageObjectsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EarnMoneyPageHomeWorkHomeWork extends BasePageHomeWork {


    public EarnMoneyPageHomeWorkHomeWork(WebDriver driver){
        super(driver);
    }

    public WebElement referralCodeField(){
        return wait.until(x->driver.findElement(By.xpath("(//input[@class])[2]")));
    }

    private WebElement copyButton() {
        return wait.until(x->driver.findElement(By.xpath("(//div[@width='auto'])[2]")));
    }
    public void copyReferralCode() {
        copyButton().click();
    }
}
