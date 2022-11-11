@Forgot
Feature: To validate forgotten password functionality of Facebook application
	@Smoke
  Scenario: To validate forgotten password functionality with Invalid email
    When user have to click forgotten password
    And user have to enter invalid email
    Then user have to click search button
