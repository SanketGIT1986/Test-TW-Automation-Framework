#Login and Search Test Scenario#

Feature: Initiate Browser
    Background: Login to website
        Given I initiate a browser and enter the URL "URL"
        When I enter the "<username>" text in "UsernameField" fieldBox
        And I enter the "<password>" text in "PasswordField" fieldBox
        Then I click on "LoginButton" button


   ##New record search ##
    Scenario Outline: Search a new value on the search page
        Given I wait for the page to load
        When I select the "<Tab>" objects
        And I enter the "<AccName>" text in "<textbox>" fieldBox
        And I click on "<SearchButton>" button
        Then I wait for the page to load



        Examples:
            |AccName|     |username| |password|
            |TestAct23|   |ABCD|     |City12307|