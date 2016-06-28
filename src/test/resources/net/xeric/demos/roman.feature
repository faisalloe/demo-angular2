Feature: Roman Feature

Scenario: Convert Integer to Roman Number
Given I am on the demo page
When I pass number 1
Then the roman numeral is I


Scenario: Convert Integer to Roman Number
Given I am on the demo page
When I pass number 5
Then the roman numeral is V

Scenario: Convert Integer to Roman Number
Given I am on the demo page
When I pass number 7
Then the roman numeral is VII

Scenario: Convert and add two Roman Number
Given I am on the demo page
When I pass numbers 1 and 2
Then the roman numeral is III
