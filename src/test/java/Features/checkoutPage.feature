Feature: place the order for products

@placeOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given user is on greencart landing page
When user searched with shortname <Name> and extracted actual name of product
And Added "25" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples: 
|Name|
|Bro | 
