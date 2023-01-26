@smoke
Feature: SS1 | Verify The Login Section
  Scenario: Verify The Login Section
    Given user goto "http://www.demo.guru99.com/V4/"
    When user enter valid username "mngr472694"
    And user enter invalid password "tAhEp"
    Then user click login
    #Expected Result
    Then A pop up "user or password is not valid"

