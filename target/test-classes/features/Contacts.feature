Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigate to "Customers" "Contacts"
    Then default page number should be 1

  Scenario: Verify Create Calender Event
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigate to "Activities" "Calendar Events"
    Then the title contains "Calendar"


  Scenario: Menu Options Driver
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

                                                                   #this is comment


  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | User10      |
      | password  | UserUser123 |
      | firstname | Brenden     |
      | lastname  | Schneider   |
    Then the user should be able to login


  Scenario Outline: login as a <firstName> <lastName>
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | <username>  |
      | password  | UserUser123 |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Then the user should be able to login
    Examples:
      | username       | firstName        | lastName  |
      | User10         | Brenden          | Schneider |
      | storemanager85 | Stephan Tremaine | Haley     |








