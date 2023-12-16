Feature: Verify drop down option

@Reg

Scenario: Validate drop down size

When user enter username "standard_user" and password "secret_sauce"
And user click on login button
Then click on dropdown option

#Then validate dropdown text