Feature: BOA Checking page

  Background:
    Given user opens chrome browser
    When user enters url

#  @Smoke
  Scenario: Validate text and links on checking page
    Given user clicks checking link
    When user validates text on checking page
    And user validates explore checking solutions button
    And user validates student banking link
    Then user validates business checking link

#  @Smoke
  Scenario: Validate checking page
    Given user clicks checking link
    When user validates text on checking page
    And user validates explore checking solutions button
    And user validates student banking link
    Then user validates business checking link

