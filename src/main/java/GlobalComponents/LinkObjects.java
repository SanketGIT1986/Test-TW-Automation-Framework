package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static GlobalComponents.DriverManager.driver;
import static GlobalComponents.PageMappingManager.mappingObj;

public class LinkObjects {

    public static WebElement singleLink;

    public static WebElement getSingleLink(String optionValue){
        singleLink = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        return singleLink;
    }


    //Salesforce Objects locator
    public static void getSingleLinkJS(String optionValue){
        singleLink = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",singleLink);
    }


    //Identify related list under each object
    public static WebElement getLink(String optionValue){
        singleLink = driver.findElement(By.xpath("//h2//span[@title = '"+optionValue+"']"));
        return singleLink;
    }
}
