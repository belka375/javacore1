package seleniumHomework.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumHomework.helpers.GetStringFromClipboard;
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
        public void openNewYorkAndAssert6ToгrsPresent() throws InterruptedException {
            var landingPage = new LandingPage(driver);
            landingPage.open();
            landingPage.openNewYorToursPage();
           // landingPage.openNewYorToursPageByChousingFirstElement();
            Assert.assertTrue(driver.findElements(By.cssSelector(".Trip__LinkWrapper-fulyrM.ewiHv")).size()==6);
        }


    /*
    Создать тест используя Page Object Model
1. зайти на титульную страницу
2. зайти в Нью-Йорк
3. убедится что видны 6 туров*/






}
