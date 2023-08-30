Feature: Cv Library Homepage
  As a user i would like to check the top bars

  Background: I am on Cv Library home page
    Given  I  open the google chrome browser
    When  I open URL : Register your Cv
    Then I am on Cv Library Home Page

  Scenario: I should be able to see the Top bar menu
    When : I open the Cv Library Home page
    Then : I am able to see the Top bar menu

  Scenario: I should be able to type  on the search on the keyword/job Title/job Ref tab
    When : I move the cursor in to the keyword/job Title/job Ref tab
    And : I am able to type in the Alphabets (Lower , Upper case) in the keyword/job Title/job Ref tab
    And : Numeric values in to the keyword/job Title/job Ref tab
    Then : I am able to type on the search on the keyword/job Title/job Ref tab

  Scenario: I should be able to type the Alphabets and numeric values in to the Location tab.
    When : I move the cursor in to the Location tab,
    And : I am able to type in the  Alphabets (Lower , Upper case) in the Location tab
    And : I am able to type numeric values in to the Location tab
    Then : I am able to type on the filed on the Location tab

  Scenario Outline: I should be able to click on the Distance tab and drop down list should appear.

    When I move the cursor in to the Distance tab.
    And I click on the drop down arrow
    And  I am able to see the drop down list "<Distance>"
    Then I am able to select the entry from the "<Distance>" list
    And I am able to select one of them from the drop down list


    Examples:
      | Distance      |
      | Up 1 mile     |
      | Up to 3 miles |
      | Up to 5 miles |
      | Up to 6 miles |
      | Up to 7 miles |
      | Up to 10 miles|
