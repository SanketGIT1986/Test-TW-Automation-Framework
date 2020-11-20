package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static GlobalComponents.DriverManager.driver;
import static GlobalComponents.PageMappingManager.mappingObj;

public class CheckboxObjects {

    public static WebElement singleCheckbox;

    public static WebElement getSingleCheckbox(String optionValue){
        singleCheckbox = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        return singleCheckbox;
    }
}
