package HW5Deens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {


    public class TestRecord {
        private WebDriver driver;

        @BeforeMethod
        public void startUp() {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(7000);
            driver.quit();
        }


        @Test
        public void tryToLogin_TryToOpenBing_BingOpened() throws InterruptedException {
            driver.get("https://bing.com/");
            var title = driver.getTitle();
            Assert.assertEquals(title, "Deens, plan my trip!", "Expected is wrong");
        }

        @Test
        public void tryToLogin_TryToOpenPage_TitlePageOpened() throws InterruptedException {
            driver.get("https://deens-master.now.sh/");
            var title = driver.getTitle();
            Assert.assertEquals(title, "Deens, plan my trip!", "Expected is wrong");
        }

        @Test
        public void openPage_TryToOpenDeens_DeensOpened() throws InterruptedException {
            driver.get("https://deens-master.now.sh/");
            var url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://deens-master.now.sh/", "Expected is wrong");
        }

    }

}