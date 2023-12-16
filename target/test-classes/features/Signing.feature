
Feature: Login functionality of swag Labs


  
Scenario: Validate login with valid details

When user enter username "standard_user" and password "secret_sauce"
And user click on login button
Then validate successful login