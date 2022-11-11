@Login
Feature: To validate login functionality of facebook application
	@Smoke @Sanity 
  Scenario: To validate login functionality with invalid username and invalid password
  
    #One Dimensional Map
    When user have to enter invalid username and invalid password
      | username  | greens@gmail.com |
      | password  |         47859646 |
      | username1 | java selenium    |
      | password1 |         12345678 |
      
    Then user have to click login button
    And user have to reach invalid login page
    
	@Sanity @Regression
  Scenario: To validate login functionality with valid username and invalid password
    #Two Dimwnsional Map
    When user have to enter valid username and invalid password
      | username     | password | userId           | pass    |
      | greenstech   | 14785236 | selenium         | java    |
      | datadriven   | Testng   | cucumber         | testing |
      | javaselenium |   174616 | greens@gmail.com |   74512 |
      | cucumber     | selenium |            14778 | 2626323 |
      
    Then user have to click login button
    And user have to reach invalid login page
