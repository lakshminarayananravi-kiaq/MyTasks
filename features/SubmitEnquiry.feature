Feature: Submit Enquiry of Infoez application

Scenario: Explore the business and submit a enquiry 

Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed
When Click on the explore button
And Click the categories dropdown and select the business
And Click the SortBy dropdown and select the option
And Click the Business
And Click the send enquiry button
And Enter the enquiry name
And Enter the enquiry phone number
And Enter the message 
When Click the send enquiry button
Then Display the message as Enquiry submitted



