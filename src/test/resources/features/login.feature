Feature: Login feature
  As a user
  I want to be ale to login

  Scenario: Successful login
    Given I have navigated to login page
    When I login with 'standard_user' and 'secret_sauce'
    Then I am successfully logged in

  Scenario Outline: Successful login
    Given I have navigated to login page
    When I login with "<username>" and "<password>"
    Then I am successfully logged in
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |

  Scenario: Unsuccessful login
    Given I have navigated to login page
    When I login with '' and 'secret_sauce'
    Then I get error message 'Epic sadface: Username is required'