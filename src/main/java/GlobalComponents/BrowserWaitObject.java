package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import GlobalComponents.DriverManager;

public class BrowserWaitObject {

    static WebDriverWait wait = new WebDriverWait(DriverManager.driver,30);

    public static void browserWait(String optionValue){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(optionValue)));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
