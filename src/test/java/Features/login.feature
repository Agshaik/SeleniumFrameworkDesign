Feature: Login page


@Test123
 Scenario Outline: : Login to the portal
    Given User is an login page
    When User clicks with submit with <username> and <password>
    Then user login is successfully

   Examples:
   |username|password|
   |user1|pass1|



