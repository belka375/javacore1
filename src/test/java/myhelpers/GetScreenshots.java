package myhelpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.internal.Utils;

import java.io.File;
import java.io.IOException;

public class GetScreenshots {
//    в качестве аргумента бедем webdriver  и название скриншота, скриншот надо закинуть в папку
    public static void capture(WebDriver driver, String screenshotName) {
       try{
//                круглые скопки - casting - когда хотим один элемент представить как другой тип
           TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
           File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(file, new File("./screenshots/"+screenshotName+ ".png"));
       }catch (IOException e){
           System.out.println("File IO problem" + e.getMessage());
       }

    }
}
