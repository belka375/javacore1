package yptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_hw1 {
    private WebDriver driver;

    @BeforeMethod
    public void Start (){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown () throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_OpenURL_TrYToOpenDeens_HomePageOpened(){
        driver.get("https://deens-master.now.sh/");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/");


        WebElement signupButton = driver.findElement(By.xpath("//a[@href='/register']"));
        signupButton.click();

    }
}
