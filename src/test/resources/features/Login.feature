

  Feature:  Library app login
    User story : as a different type of user I should be able to login

      Scenario: login as student
        Given user at the login page
        When student enters username and password
        And student clicks on login button
        Then student verifies username at the navigation bar


        Scenario: login as a librarian
          Given user at the login page
          When librarian enters username and password
          And librarian clicks on login button
          Then librarian verifies username at the navigation bar


