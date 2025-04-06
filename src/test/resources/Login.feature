Feature:Facbook user login application 

Scenario: To validate login with Valid Email and Invalid password 

Given open the browser launch the url
When Enter Valid User Email and invalid password
And User click the Login button 
And User get webpage title
And User get current Url
Then User is an Invalid credential page  

Scenario: To validate login with Invalid Email and Invalid password 

Given open the browser launch the url
When Enter Invalid User Email and invalid password
|       userName      |PhoneNumber|Password|
|pjirabsjadb@gmail.com|724167141  |phwwdjs|

And User click the Login button 
And User get webpage title
And User get current Url
Then User is an Invalid credential page  