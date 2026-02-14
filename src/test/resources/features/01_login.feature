Feature: Logging Functionality
  # This feature tests the user login for the MySLT portal [cite: 156]

  Scenario: User logs in with valid credentials
    Given I open the browser
    When I enter username and password
    Then I should be logged in successfully