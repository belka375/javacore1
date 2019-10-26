package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EarnMoney {
    WebDriver driver;

    public EarnMoney(WebDriver driver) {
        this.driver = driver;
    }
    public void clickEarnMoney(){
        getEarnMoney().click();
    }
    public void searchTrips(String trips){
        getFieldSearchTrips().clear();
        getFieldSearchTrips().sendKeys(trips);
        getFieldSearchTrips().sendKeys(Keys.ENTER);
        //Assert
        Assert.assertTrue(getButtonCreateTrip().isDisplayed());



    }
    private WebElement getEarnMoney(){
        return driver.findElement(By.xpath("(//*[contains(text(), 'Earn Money')])[1]"));
    }
    private WebElement getFieldSearchTrips(){
        return driver.findElement(By.cssSelector("[class='SearchInput__Input-kWKMzR iWwhuT']"));
    }
    private WebElement getButtonCreateTrip(){
        return driver.findElement(By.xpath("//*[contains (text(),'Create a trip')]"));
    }
}





    /*Создать тест используя Page Object Model
    автоматизировать на сайте https://deens-master.now.sh/
        workflow -> Landing Page -> Login Page ->Earn Money Page:
        а. скопировать в клипбоард референсный код
        б. ассерт что код в памяти тот же что и в поле*/