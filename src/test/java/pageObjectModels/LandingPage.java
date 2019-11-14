package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);

    }

    public void open() {
        driver.get("https://www.aviasales.ru");
    }

    public LandingPage fillFromToField (String departureCity, String destinationCity){
        getOrifinField().sendKeys(departureCity);
        getDestinationField().sendKeys(destinationCity);
    return new LandingPage(driver);
    }

    private WebElement getOrifinField() {
        return driver.findElement(By.cssSelector("#origin"));
    }

    private WebElement getDestinationField() {
       return driver.findElement(By.cssSelector("#destination"));
    }

    public void chooseDepartDate ()  {
    driver.findElement(By.cssSelector("#departDate")).click();
    var departDate = driver.findElement(By.xpath("//*[ text() = 20]"));
    departDate.click();

    }

    public void chooseReturnDate() {
       var returnDate = driver.findElement(By.xpath("//*[ text() = 30]"));
       returnDate.click();
    }

    WebElement passengers() {
        return driver.findElement(By.xpath("//*[@*='additional-fields__label']"));
    }

    public void chooseNumberOfPassangers() {
        passengers().click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@*='#FFF'])[2]")));

    }
        WebElement searchForTicketsButton() {return driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
        }

        public void pressSearchForTicketsButtonAndBuy() {
        searchForTicketsButton().click();


        }


        WebElement routeScheme() {
        return wait.until(driver -> driver.findElement(By.xpath("//*[@href='#multiway']")));
    }


    public boolean showRouteScheme() {
      return routeScheme().isDisplayed();
    }



    }


