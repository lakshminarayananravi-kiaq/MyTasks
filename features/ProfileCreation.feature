Feature: Profile Management As a registered user want to create and update profile details

Scenario: Successfully create and save profile details
Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed
When  Click on the username button
And Click on the profile button
And Enter the name as 'Lakshmi'
And Enter the phonenumber as '8637668370'
When Click on the savechanges button
Then profile update messages should be displayed
