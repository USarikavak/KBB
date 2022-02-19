Feature:CarValues

    Background: chrome testing
    @smoke
    Scenario: Verifying the Price New/Used Model


    When I hover over 'CarValues'
    And I click 'the Price New/Used'
    Then I verify 'Car Price' is displayed.