Feature: Remove product from cart



Scenario: Remove item from cart


When user enter username "standard_user" and password "secret_sauce"
And user click on login button
Then validate successful login
And add product from product page
And click on add cart option
Then click on remove button