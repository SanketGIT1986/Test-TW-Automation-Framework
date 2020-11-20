package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static GlobalComponents.DriverManager.driver;
import static GlobalComponents.PageMappingManager.mappingObj;

public class ButtonObjects {

    public static WebElement singleButton;

    public static WebElement getSingleButton(String optionValue){
        singleButton = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        return singleButton;
    }

    public static void getSingleButtonJS(String optionValue){
        singleButton = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",singleButton);
    }
}
