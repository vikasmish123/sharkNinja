Feature: remove item from different method



Scenario: remove itme method

When user enter username "standard_user" and password "secret_sauce"
And user click on login button
Then validate successful login
And add product from product page
And click on add cart option
And click on product option
Then click on remove button option