Feature: add to Payment 


 
Scenario: confim payment details

When user enter username "standard_user" and password "secret_sauce"
And user click on login button
And add product from product page
And click on add cart option 
When click on checkout button
Then user enter Firstname "Vikas" and Lastname "Mishra" and zipcode "271132"
And user click on continue button
And click on finish button
Then order successful messgae