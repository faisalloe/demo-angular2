Feature: Counter feature

  Scenario: The counter increments
    Given I am on the demo page
    When the counter is called
    Then the count increases