@Feature 1
Feature: To search products in myntra shopping application
@Myntra
Scenario: Search clothing products in myntra application

Given To launch the browser and maximise the window
When To launch the url on myntra application
And To click the product search box

And To pass the product that to be search
#key               value
|product1|Roadster Sweatshirts|
|product2|RareRabit Partywears|
|product3|LP Jeans|
|product4|Raymond Formal Clothings|

And To click the search button
Then To close the applications
