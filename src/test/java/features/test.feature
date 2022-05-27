Feature: Login to SF Org
  As a user, I'd like to login to my Salesforce Org.

  Scenario: Login with the correct password
    Given The user is in the Org Login Page
    When the user fills in an email: "incubatorteam@oktana.com"
    And writes a password: "incubator2023"
    Then the Setup Page should be shown to the user


  Scenario: Login with an incorrect password
    Given The user is in the Org Login Page
    When the user fills in an email: "incubatorteam@oktana.com"
    And writes a password: "incubator2022"
    Then an error message should be shown to the user