package Runner;

import GlobalComponents.DriverManager;
//import cucumber.api.;
import GlobalComponents.PageMappingManager;
import GlobalComponents.ScreenshotManager;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.Properties;


@CucumberOptions(
        plugin = {"pretty","html:target/site/cucumber-html-report.html"},
        features = {"./src/test/Resources/Feature/LoginAndSearchPage.feature"},
        glue = {"StepDefinitions","GlobalComponents"}
)

@RunWith(Cucumber.class)

public class TestRunner {

    protected static Properties mappingObj;

    @BeforeClass
    public static void beforeClass(){
        try {
            System.out.println("Testing started");
            mappingObj = PageMappingManager.getMappingObj();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @AfterClass
    public static void afterClass(){
        ScreenshotManager.captureScreenShot();
        DriverManager.driver.quit();
        System.out.println("Testing completed");
    }

}
