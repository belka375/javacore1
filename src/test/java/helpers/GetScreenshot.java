package helpers;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonOutput;

import java.io.File;
import java.io.IOException;

public class GetScreenshot {
    public static void capture(WebDriver driver, String screenshotName){
        try{
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("./Screenshots/"+screenshotName+".png"));
        }catch (IOException e){
            System.out.println("File write problem " +e.getMessage());
        }
    }
}
