@smoke
Feature: SS1 | Verify The Login Section
  Scenario: Verify The Login Section
    Given user goto "http://www.demo.guru99.com/V4/"
    When user enter invalid username "mngr4726"
    And user enter valid password "tAhyvEp"
    Then user click login
    #Expected Result
    Then A pop up "user or password is not valid"

