package hw9;

//***Test1 - implicit wait + cssSelectors

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Testshw9_1 {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_LoginYouAccount_UsingCssSelectors_loginSuccessful() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://deens-master.now.sh/login");


        driver.findElement(By.cssSelector("[href='/login']")).click();

        WebElement id = driver.findElement(By.cssSelector("#email"));
        id.sendKeys("kgold94@myself.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("freedom51");

        WebElement login = driver.findElement(By.cssSelector(".green-btn.pl-btn"));
        login.click();

        //Assert verify image presents
         WebElement img = driver.findElement(By.cssSelector("[src='/world.png']"));
        Assert.assertTrue(img.isDisplayed());
    }

}

     //Assert
     //   Thread.sleep(2000);
    /*  @Test
              public void Checkimage() throws Exception{
                driver.getCurrentUrl();
             WebElement imageFile = driver.findElement(By.cssSelector("[alt=kg94]"));
                    Boolean ImagePresent = (Boolean) (JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
                   if (!ImagePresent)  {
                       System.out.println("Image is not here");
                   }
                   else{
                       System.out.println("Image displayed");
                   }



    }*/












































