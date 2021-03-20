@navigate
Feature: Checking page title
  Scenario: Navigating Fleet -> Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet -> Vehicles
    Then the user should be able to see title: Vehicles
@DB
  Scenario: Navigating Marketing -> Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing -> Campaigns
    Then the user should be able to see title: Campaigns

  Scenario: Navigating Activities -> Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities -> Calendar Events
    Then the user should be able to see title: Calendars

