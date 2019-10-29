package seleniumHomework.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {
    WebDriver driver;

    public static void down(WebDriver driver, String HowMuchToScroll){

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,"+HowMuchToScroll+")", "");
    }
}
