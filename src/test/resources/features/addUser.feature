Feature: add user

  Background: user is on the login page
Given user is on the login page



  Scenario: add user as librarian

    When librarian enters username and password
    And librarian clicks on login button
    Then librarian verifies username at the navigation bar
    And librarian clicks on users
    And librarian clicks on add user
    And librarian fill in the blanks and click save changes
    And librarian verifies full name email and status active on the users page



      Then librarian clicks on editUser
      And change status to inactive
      And clicks save changes
      Then verifies the fullname is not on the top of the list