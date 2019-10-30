package shw10;
//*Write test, using Page Object Model
//*Site https://deens-master.now.sh/
//*workflow -> Sign up:
//*a. Open Sign Up page,
//*b. fill fields
//*c. Sign up to the site
//*d. Assert
//*(Create new class SignUpPage)
//*Collapse

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

    public class LandingPage {
        private WebDriver driver;
        Wait<WebDriver> wait;


        public LandingPage(WebDriver driver) {
            this.driver = driver;
            wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(Exception.class);
        }

        public void openPage() {
            driver.get("https://deens-master.now.sh/");

        }

        public WebElement getSignupButton() {
            var signupButton = wait.until(z -> driver.findElement((By.xpath("//a[@href = '/register']"))));
            return signupButton;
        }

        public SignUpPage openSignUpPage() {
            getSignupButton().click();
            SignUpPage signupPage = new SignUpPage(driver);
            return signupPage;
        }

    }
