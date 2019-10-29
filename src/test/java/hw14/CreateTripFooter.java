package hw14;

import DeensPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class CreateTripFooter extends BasePage {
        public CreateTripFooter(WebDriver driver) {
            super(driver);
        }

    public WebElement getButton() {
        return wait.until(x->driver.findElement(By.xpath("(//*[@href='/new/trip'])[2]")));
    }
    }



