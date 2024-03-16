Feature: To validate the account creation of fb application

Scenario: To create new account
Given To launch the browser and maximise the window
When To launch url of fb application
And To click the create new account button

# One dimentional map data
And To pass firstname in firstname text box
#key        value
|firstname1|John|
|firstname2|Joe|
|firstname3|Peter|
|firstname4|Barbara|

And To pass secondname in secondname text box
And To pass mobileno or email in email text box
|seleniuminmakes@gmail.com|9500315396|inmakes@gmail.com|8887522235|
|7770521321|abcd@gmail.com|softwaretesting@gmail.com|9995543321|
|automationtesting@gmail.com|abc123@gmail.com|8524568129|7779825218|
And To create new password using new password text box
Then To close the edge browser