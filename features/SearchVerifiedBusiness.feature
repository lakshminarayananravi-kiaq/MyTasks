Feature: verified business functionality of Infoez application 

Scenario: Explore and search the verified business 

Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed
When Click on the explore button
And Click the categories dropdown and select the business
And Click the SortBy dropdown and select the option
When Click the verified checkbox
Then It should display the verified business



