Feature: Search and place the order for products

@placeOrder
Scenario: Search Experience for product search in both home and offers page

Given user is on greencart landing page
When user searched with shortname "Tom" and extracted actual name of product
Then user searched for "Tom" shortname in offer page
And validate product name in offer page matches with landing page


@OfferPage
Scenario Outline: Search Experience for product search in both home and offers page

Given user is on greencart landing page
When user searched with shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offer page
And validate product name in offer page matches with landing page

Examples: 
|Name|
|Bro |
|Beet| 