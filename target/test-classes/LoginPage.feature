Feature: BOA Login page

  Background:
    Given user opens chrome browser
    When user enters url

#  @Smoke
  Scenario Outline: Login functionality with multiple users and passwords
    And user enters "<username>" and "<password>"
    And user clicks saveID button
    Then user validate open account link

    Examples:
      | username | password |
      | laksdfj7 | 2432eee4 |
      | iwouer88 | wwwr444s |
      | nmnmn444 | 1122www4 |