package Homework.shw14;

import org.openqa.selenium.*;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver){
        super(driver);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }


    public WebElement openCreateTripLink() throws InterruptedException {
        boolean staleElement = true;
        WebElement button = null;
        while(staleElement){
            try{
                button = driver.findElement(By.xpath("//*[text()='Create a Trip & Start Earning']"));
                staleElement = false;
            } catch(StaleElementReferenceException e){
                staleElement = true;
                Thread.sleep(100);
            }
        }
        return button;
    }

    public void getCreateTripLink() throws InterruptedException{
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        openCreateTripLink().click();
    }
}