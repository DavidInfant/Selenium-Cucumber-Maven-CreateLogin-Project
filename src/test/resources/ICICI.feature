@Feature
Feature: To login into the ICICI bank application

@ICICIBank
Scenario: To login into the ICICI bank application with multiple given inputs

Given Launch the browser and maximise the window
When Launch the ICICI url in the browser
And Click the login button
#One dimentioanl data
And To pass the userid in userid box
#key     value
|userid1|1234567|
|userid2|1321651|
|userid3|1213112|
|userid4|1132213|

And To pass the password in password box
|abcd@123|abcd213|selenium|
|softwaretesting|inmakesInfo|testNG123|

Then Close the browser
