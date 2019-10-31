package hw15;

import DeensPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import shw_Practice.BaseTests;

public class HoverLogin extends BaseTests {
    @Test
    public void openDeens_moveMouseToLoginButton_buttonChangedColor()  {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        var login=driver.findElement(By.xpath("//*[@href='/login']"));
        Actions act=new Actions(driver);
        String buttonColor=login.getCssValue("background-color");
        System.out.println("Before action:"+buttonColor);
        act.moveToElement(login).perform();
        act.perform();
        buttonColor=login.getCssValue("background-color");;
        System.out.println("After action:"+ buttonColor);
        Assert.assertTrue(buttonColor.contains("rgba(118, 196, 227, 1)"),"Color changed after mouse over button action");
//        login.getCssValue("background-color");
//        System.out.println("Before action:"+buttonColor);
//        Actions act=new Actions(driver);
//        act.moveToElement(login).perform();
//        Thread.sleep(5000);
//        System.out.println("After action:"+ buttonColor);


    }
}
