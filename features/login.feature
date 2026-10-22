Feature: Login functionality of Infoez application


Scenario: Login with valid credentials
Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then it should be navigated to the login page


Scenario: Login with invalid credentials
Given Launch the browser
And Load the url
And Enter the username as 'customer@kiaq.com'
And Enter the password as Customer@123
When Click on the Login button
Then it shown as invalid credentials

Scenario: Verify Welcome message after login
Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed

Scenario: Verify Invalid credentials message after login
Given Launch the browser
And Load the url
And Enter the username as 'customer@kiaq.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Invalid Credentials message should be displayed




