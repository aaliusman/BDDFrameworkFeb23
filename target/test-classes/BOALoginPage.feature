Feature: BOA Login page

  Background:
    Given user opens chrome browser
    When user enters url

  @Regression
  Scenario: Login functionality with incorrect username
    And user enters incorrect username and password
    And user clicks saveID button
#    And user clicks login button
#    Then user validate error message

  @Regression
  Scenario: Validate open account button
    And user enters incorrect username and password
    And user clicks saveID button
    Then user validate open account link
#    And user clicks login button
#    Then user validate error message






