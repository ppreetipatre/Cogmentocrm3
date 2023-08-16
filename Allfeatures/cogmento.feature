Feature: Test congmento application

  Scenario: Test login page
    Given user is on Login page
    When user enter Loginname and password
    Then click on login button

  Scenario: Test create customer page
    When User enter personal information
    Then click on save button
