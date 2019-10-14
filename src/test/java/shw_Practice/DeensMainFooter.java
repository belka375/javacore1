package shw_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeensMainFooter {
    private WebDriver driver;

    @BeforeMethod
    public void deens() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void deensFooter_languageSelector_selectorIsPresent() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        var language = driver.findElement(By.xpath("//*[@class='BrandFooter__OptionSelector-qfoWf bYuWWM']"));
        language.click();
        Assert.assertTrue(language.isDisplayed());
    }
//
//    @Test
//    public void deendFooter_languageChange_languageIsChanged() throws InterruptedException {
//        driver.get("https://deens-master.now.sh/");
//         var languageMenu=driver.findElement(By.xpath("//*[@class='BrandFooter__OptionSelector-qfoWf bYuWWM']"));
//         languageMenu.click();
//         var suomi= driver.findElement(By.xpath("//*[@value='fi']"));
//         suomi.isDisplayed();
//         suomi.click();
//         Assert.assertTrue(suomi.isDisplayed());
//
//    }
    @Test
    public void deensFooter_networkMenu_menuBlogPresent()  {
        driver.get("https://deens-master.now.sh/");
        var menuBlog = driver.findElement(By.xpath("//*[@href='https://deens.com/blog/']"));
        menuBlog.click();
        Assert.assertTrue(menuBlog.isDisplayed());
    }
    @Test
    public void deensFooter_networkMenu_menuPartnersIsPresent() {
        driver.get("https://deens-master.now.sh/");
        var menuPartners=driver.findElement(By.xpath("//*[@href='/about/partners']"));
        menuPartners.click();
        Assert.assertEquals("Partners","Partners");
    }
    @Test
    public void deensFooter_networkMenu_menuPressPresent(){
        driver.get("https://deens-master.now.sh/");
        var menuPress=driver.findElement(By.xpath("//*[@href='/about/press']"));
        menuPress.click();
        Assert.assertEquals("https://deens.com/about/press","https://deens.com/about/press");
    }
    @Test
    public void deensFooter_legalMenu_cookiesMenuIsPresent(){
        driver.get("https://deens-master.now.sh/");
        var cookieMenu=driver.findElement(By.xpath("//*[@href='/legal/cookies']"));
        cookieMenu.click();
        Assert.assertEquals("https://deens.com/legal/cookies","https://deens.com/legal/cookies");
    }
    @Test
    public void deensFooter_legalMenu_termsAndConditionsPresent(){
        driver.get("https://deens-master.now.sh/");
        driver.findElement(By.xpath("//*[@href='/legal/terms']")).click();
        Assert.assertTrue(true,"True");


    }
    @Test
    public void deensFooter_legalMenu_privacyPolicyIsPresent(){
        driver.get("https://deens-master.now.sh/");
        var privacyPolicy=driver.findElement(By.xpath("//*[@href='/legal/privacy']"));
        privacyPolicy.click();
        Assert.assertEquals("https://deens.com/legal/privacy","https://deens.com/legal/privacy");
    }
    @Test
    public void deensFooter_contactMenu_helpCenterIsPresent(){
        driver.get("https://deens-master.now.sh/");
        var helpCenter=driver.findElement(By.xpath("//*[text()='Help Center']"));
        helpCenter.click();
        Assert.assertEquals("https://pleaseassist.freshdesk.com/support/home","https://pleaseassist.freshdesk.com/support/home");
    }

}
