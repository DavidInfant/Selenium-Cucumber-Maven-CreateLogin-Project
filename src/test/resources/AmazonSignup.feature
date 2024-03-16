Feature: To create account in amazon application

Scenario: To create new account
Given To launch the browser and maximise the window
When To launch url of amazon application
And To click the create new account button

#One dimentional data
And To pass the first and lastname in first and last text box
#key               value
|firstandlastname1|John Doe|
|firstandlastname2|Jane Doe|
|firstandlastname3|Peter han|
|firstandlastname4|Herman Smith|

And To pass the mobile number in mobile number text box
And To pass the password in password text box
|123456|abcdefg|12345@abc|
|abcd@123|seleniumtesting|inmakesInfotech@123|

Then close the browswer