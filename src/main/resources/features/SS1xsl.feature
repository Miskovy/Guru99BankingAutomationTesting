@smoke
Feature: SS1 | Verify The Login Section
  Scenario: Verify The Login Section
    Given user goto "http://www.demo.guru99.com/V4/"
    When user enter valid userId
    And user enter valid password
    Then user click login
    #Expected Result
    Then login is successful
    And Manager ID is Shown in op

