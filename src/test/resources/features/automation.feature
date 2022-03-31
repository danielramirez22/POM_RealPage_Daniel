@Regresion
Feature: User Creates an account

  @RegisterAccount
  Scenario Outline: User can create an account
    Given The user is on Homepage
    Then the user clicks on Sign in
    And user enters email and password
      | <Email> | <Pass>|
    And user clicks register
    Then the user is taken my account page
      | <ConfirmAccount> |

    Examples:
      | Email                               |Pass         | ConfirmAccount      |
      | danieleonardo29@gmail.com           |Yopmail1234, | danieleonardo229     |

    @LoginAccount
    Scenario Outline: User can login in his account
      Given The user is on Home
      Then the user clicks on MyAccount
      And user enters email and password on login frame
        | <Email> | <Pass>|
      And user clicks Login
      Then the user is taken My Account Page
        | <ConfirmAccount> |

      Examples:
        | Email                               |Pass         | ConfirmAccount      |
        | danieleonardo229@gmail.com          |Yopmail1234, | danieleonardo229    |

  @FailLoginAccount
  Scenario Outline: User can't login without a valid username
    Given The user is on principal page
    Then The user clicks on MyAccount
    And user enters an incorrect email and an incorrect password
      | <Email> | <Pass>|
    And The user clicks Login
    Then the user can not login in the webside
      | <ConfirmAccount> |

    Examples:
      | Email                               |Pass         | ConfirmAccount      |
      | pepitonoentra@gmail.com             |Juanito123Y, | Error               |