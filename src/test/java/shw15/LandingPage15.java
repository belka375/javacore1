package shw15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;


    public class LandingPage15 {
        private WebDriver driver;
        Wait<WebDriver> wait;


        public LandingPage15(WebDriver driver) {
            this.driver = driver;
            wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(Exception.class);
        }

        public void openPage() {
            driver.get("https://deens-master.now.sh/");
        }

        public WebElement getLoginButton() {
            var loginButton = wait.until(x -> driver.findElement(By.xpath("//*[@href='/login']")));
              return loginButton;
        }

        public String getLoginButtonColor() {
            String color = getLoginButton().getCssValue("background-color");
            return Color.fromString(color).asHex();
        }

        public void hoverOverLoginButton() {
            Actions action = new Actions(driver);
            action.moveToElement(getLoginButton()).build().perform();
        }

        public boolean loginButtonWithChangedColor() {
            return wait.until(z -> driver.findElement(By.cssSelector("[class$='gjsHQW']>div>a:hover"))).isDisplayed();
        }

    }


