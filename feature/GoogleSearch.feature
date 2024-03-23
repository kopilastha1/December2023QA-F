
Feature: google Search

Scenario Outline: perform a googole job search

Given I am in the Google homepage
When I enter search "<term>"
And I click on google search button
Then I received related search result

Examples:
|term                   |
|Quality Assurance Jobs |
|Software Testing Jobs  |