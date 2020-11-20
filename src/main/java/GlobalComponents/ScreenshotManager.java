package GlobalComponents;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static GlobalComponents.DriverManager.driver;

public class ScreenshotManager {

    public static void captureScreenShot(){
        try {
            TakesScreenshot scrshot = ((TakesScreenshot) driver);
            File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcfile, new File("out/Test Screenshots/TestScr_" + System.currentTimeMillis() + ".png"));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
