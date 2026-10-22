Feature: Review of Infoez application

Scenario: Explore the business and write a review

Given Launch the browser
And Load the url
And Enter the username as 'customer@infoez.com'
And Enter the password as Customer@123
When Click on the Login button
Then The Welcome message should be displayed
When Click on the explore button
And Click the categories dropdown and select the business
And Click the SortBy dropdown and select the option
And Click the rating and select the rating
And Click the Business
And Click on the review button
And Select the rating
Given Enter the comment 
When Click the post review button
Then Display the message as Review posted