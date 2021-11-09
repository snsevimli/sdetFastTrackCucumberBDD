Feature: add book


  Scenario: add book
   Given user at the login page
    When librarian enters username and password
    And librarian clicks on login button
    And librarian clicks on Books
    Then librarian fills in the blanks and click save changes
    And verifies book name on the top of the list