package seleniumHomework.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumHomework.helpers.GetStringFromClipboard;
import seleniumHomework.helpers.Scroll;
import seleniumHomework.pageObjects.LandingPage;
import seleniumHomework.pageObjects.SignUpPage;

public class SeleniumHomework extends BaseTest {

        @Test
        public void openSignUpPageAndSignUpWithRandomCredentials(){
            var landingPage = new LandingPage(driver);
            landingPage.open();
            SignUpPage signUpPage = landingPage.openSignUpPage();
            signUpPage.loginWithRandomCredantials(8, 8,8);
            signUpPage.assertlogin();
        }

        //Homework11
        @Test
        public void loginInOpenEarnMoneyPage() throws Exception {
            var landingPage = loginToApp("prostotest", "prostotest");
            var earnMoneyPage = landingPage.openEarnMoneyPage();
            earnMoneyPage.getreferal();
            GetStringFromClipboard.doit();
            Assert.assertEquals(driver.findElement(By.cssSelector(".StyledInput__Input-eYzgai.cEeEgB")).getAttribute("value"),GetStringFromClipboard.doit());
        }

        //Homework13
        @Test
        public void openNewYorkAndAssert6ToгrsPresent() {
            var landingPage = new LandingPage(driver);
            landingPage.open();
            landingPage.openNewYorToursPage();
            Assert.assertTrue(driver.findElements(By.cssSelector(".Trip__LinkWrapper-fulyrM.ewiHv")).size()==6);
        }

    //Homework14
    @Test
    public void scrolDownManePage(){
            var landingPage = new LandingPage(driver);
            landingPage.open();
            Scroll.down(driver,"2500");
            landingPage.getcreateTripAndStarErningButton().click();
        }

    //Homework15
    @Test
    public void hoverOverLoginButton () {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        String defaultColor = landingPage.getLoginButton().getCssValue("background-color");
        Actions hover = new Actions(driver);
        hover.moveToElement(landingPage.getLoginButton()).build().perform();
        Assert.assertNotSame(defaultColor, (landingPage.getLoginButton().getCssValue("background-color")));
        }
}
