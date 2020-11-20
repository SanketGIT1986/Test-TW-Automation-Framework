package GlobalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static GlobalComponents.PageMappingManager.mappingObj;

public class DriverManager {

   public static WebDriver driver;

    public static void initBrowser(String optionValue) {
        System.setProperty("webdriver.chrome.driver", FileLocation.chromeloc);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("--start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        driver.get(mappingObj.getProperty(optionValue));
    }

    public static void getBrowserTitle(String testValue){
        testValue = driver.getTitle();
        System.out.println(testValue);
    }

    public static void initSameBrowser(String optionValue){
        String userProfile= "C:/Users/user/AppData/Local/Google/Chrome/User Data/";
        System.setProperty("webdriver.chrome.driver",FileLocation.chromeloc);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir="+userProfile);
        options.addArguments("--profile-directory=Default");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get(mappingObj.getProperty(optionValue));
    }

}
