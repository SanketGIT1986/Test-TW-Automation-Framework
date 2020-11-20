package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static GlobalComponents.DriverManager.driver;
import static GlobalComponents.PageMappingManager.mappingObj;

public class DropdownObjects {

    public static WebElement singleDropdown;

    public static WebElement getSingleDropdown(String optionValue){
        singleDropdown = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        return singleDropdown;
    }
}
