package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private WebDriver driver;
    private  WebElement earnMoney=driver.findElement(By.xpath("(//*[contains(text(), 'Earn')])[1]"));
    public LandingPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getEarnMoney() {
        return earnMoney;
    }
    public  void clickEarnMoney(){
        getEarnMoney().click();
    }
}
