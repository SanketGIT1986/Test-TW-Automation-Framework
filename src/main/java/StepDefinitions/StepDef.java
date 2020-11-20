package StepDefinitions;

import GlobalComponents.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class StepDef {


    @Given("^I initiate a browser and enter the URL \"([^\"]*)\"$")
    public void initBrowser(String testValue) {
        try{
            DriverManager.initBrowser(testValue);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I enter the \"([^\"]*)\" text in \"([^\"]*)\" fieldBox$")
    public void enterTextInput(String testValue, String fieldValue) {
        try{
            Thread.sleep(5000);
            TextBoxObjects.getSingleTextInput(fieldValue).click();
            TextBoxObjects.getSingleTextInput(fieldValue).clear();
            TextBoxObjects.getSingleTextInput(fieldValue).sendKeys(testValue);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @When("^I select the \"([^\"]*)\" objects$")
    public void clickObjectJS(String testValue) {
        try{
            Thread.sleep(5000);
            LinkObjects.getSingleLinkJS(testValue);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^I verify \"([^\"]*)\" is displayed$")
    public void verifyHomePage(String fieldValue) {
        try {
            Thread.sleep(5000);
            BrowserWaitObject.browserWait(fieldValue);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I enter search text \"([^\"]*)\" in \"([^\"]*)\" search box$")
    public void enterSearchQuery(String testValue,String fieldValue) {
        TextBoxObjects.getSingleTextInput(fieldValue).sendKeys(testValue);
    }

    @Then("^I wait for the page to load$")
    public void waitForPageLoad() {
        try {
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^I click on \"([^\"]*)\" button$")
    public void clickSearchButtom(String fieldValue) {
        try {
            Thread.sleep(5000);
            ButtonObjects.getSingleButton(fieldValue).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @When("^I click on the button$")
    public void clickButton(String testValue,String fieldValue) {
        try {
            TextBoxObjects.getSingleTextInput(fieldValue).sendKeys(testValue);
            ButtonObjects.getSingleButton(fieldValue).click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I validate the \"([^\"]*)\" value is present on the page$")
    public void getValue(String testValue){
        try{
            TextBoxObjects.getTextOutput(testValue);
            System.out.println("The element is present on the page");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I select the \"([^\"]*)\" title value present on the page$")
    public void selectTitleValue(String testValue){
        try{
            TextBoxObjects.getTitleOutput(testValue).click();
            System.out.println("The element is present on the page");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I select the \"([^\"]*)\" text value present on the page$")
    public void selectTextValue(String testValue){
        try{
            TextBoxObjects.getTextOutput(testValue);
            System.out.println("The element is present on the page");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I click on the \"([^\"]*)\" link present on the page$")
    public void clickLink(String testValue){
        try{
            Thread.sleep(5000);
            LinkObjects.getSingleLinkJS(testValue);
            System.out.println("The related list is present on the page");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^I select the value \"([^\"]*)\" from the \"([^\"]*)\" dropdown present on the page$")
    public void selectDropdownValue(String testValue, String fieldvalue){
        try{
            Select select = new Select(DropdownObjects.getSingleDropdown(fieldvalue));
            select.selectByVisibleText(testValue);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("^Total number of error messages present on the page$")
    public void getErrorMessageOutput(){
        try{
            TextBoxObjects.getErrorTextOutPut();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
