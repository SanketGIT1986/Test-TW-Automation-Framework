package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static GlobalComponents.DriverManager.driver;
import static GlobalComponents.PageMappingManager.mappingObj;

public class TextBoxObjects {

    public static WebElement singleTextInput;

    public static WebElement getSingleTextInput(String optionValue){
       singleTextInput = driver.findElement(By.xpath(mappingObj.getProperty(optionValue)));
        return singleTextInput;
    }

    public static void getTextOutput(String optionValue){
        singleTextInput = driver.findElement(By.xpath("//div[@class = 'windowViewMode-normal oneContent active lafPageHost']//a[contains(text(), '"+optionValue+"') and @data-navigable = 'true']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",singleTextInput);
        //return singleTextInput;
    }

    public static WebElement getTitleOutput(String optionValue){
        singleTextInput = driver.findElement(By.xpath("//div[@class = 'windowViewMode-normal oneContent active lafPageHost']//a[contains(@title, '"+optionValue+"')]"));
        return singleTextInput;
    }

    //Display error messages on the page
    public static void getErrorTextOutPut(){
        List<WebElement> list = new ArrayList<WebElement>(driver.findElements(By.xpath(mappingObj.getProperty("ErrorMessageText"))));
        System.out.println(list.size());
        for (WebElement we: list) {
            System.out.println("The error message displayed is :" +we.getText());
        }
    }

}
