package tests;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecord {
    private WebDriver driver;

    @BeforeMethod
    public void sratUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver 2");

        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        //destroi the browser

        driver.quit();
    }

    @Test
    public void openUrl_TryToOpenDeens_DeensOpened() {


        //open the page

        driver.get("https://deens-master.now.sh/");

        //get title of the page
        var title = driver.getTitle();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong!");


    }

    @Test
    public void openUrl_TryToOpenDeens_BeengOpened() {


        //open the page

        driver.get("https://Beeng.com/");

        //get title of the page
        var title = driver.getTitle();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong!");
    }

    @Test
    public void openUrl_TryToOpenDeens_GoogleOpened() {


        //open the page

        driver.get("https://Google.com/");

        //get title of the page
        var title = driver.getTitle();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong!");
    }
    @Test
    public void assertUrl_TryToOpenDeens_DeensOpened() {


        //open the page

        driver.get("https://deens-master.now.sh/");

        //get title of the page
        var url = driver.getCurrentUrl();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(url, "https://deens-master.now.sh/", "Expected url is wrong!");
    }
    @Test
    public void assertUrl_TryToOpenAnnaSenaArt_AnnaSenaArtOpened() {


        //open the page

        driver.get("https://annasena.art");

        //get title of the page
        var url = driver.getCurrentUrl();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(url, "https://annasena.art/", "Expected url is wrong!");
    }
    @Test
    public void assertTitle_TryToOpenAnnaSenaArt_AnnaSenaArtOpened() {


        //open the page

        driver.get("https://annasena.art");

        //get title of the page
        var title = driver.getTitle();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(title, "Anna Sena Art", "Expected title is wrong!");
    }
    @Test
    public void getPageSource_TryToOpenAnnaSenaArt_AnnaSenaArtOpened() {


        //open the page

        driver.get("https://annasena.art");

        //get title of the page
        var pageSource = driver.getPageSource();
        //Assert cont 3 part: actualm, expected, error message

        System.out.println("page source "+pageSource);
    }

    @Test
    public void assertTitle_TryToOpenHomeAay_HomeAayOpened() {


        //open the page

        driver.get("https://www.homeaway.co.uk");

        //get title of the page
        var title = driver.getTitle();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(title, "HomeAway.co.uk | Book your holiday lettings: villas, apartments, cottages", "Expected title is wrong!");
    }
    @Test
    public void assertUrl_TryToOpenHomeAay_HomeAayOpened() {


        //open the page

        driver.get("https://www.homeaway.co.uk");

        //get title of the page
        var url = driver.getCurrentUrl();
        //Assert cont 3 part: actualm, expected, error message

        Assert.assertEquals(url, "https://www.homeaway.co.uk/", "Expected url is wrong!");
    }


}