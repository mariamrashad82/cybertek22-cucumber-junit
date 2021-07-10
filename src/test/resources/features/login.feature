
@regression @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

    #this is how comment in feature file

  @librarian
  Scenario: Login as librarian
    Given User is on login page
    When  User enters librarian username
    And   User enters librarian password
    Then  User should see the dashboard

  @student
    Scenario: Login as student
      Given User is on login page
      When  User enters student username
      And   User enters student password
      Then  User should see the dashboard

  @admin
  Scenario: Login as admin
    Given User is on login page
    When  User enters admin username
    And   User enters admin password
    Then  User should see the dashboard

