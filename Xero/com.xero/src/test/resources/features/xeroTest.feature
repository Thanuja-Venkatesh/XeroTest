Feature: As a user adding an ANZ bank account inside Xero Organisation

  Scenario Outline: Login and Adding an “ANZ” bank account inside Xero Organisation
    Given Login with "<userid>" and "<password>"
    And Select authenticator type
    And Enter answer for authenticator question and submit
    When Add bank account under accounting 
    Then Check added account displaying or not
    
    
    Examples:
    |userid | password|
    |thanujaselvi@gmail.com| Test@1234 |
    