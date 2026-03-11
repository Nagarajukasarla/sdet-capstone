Feature: WordPress Website Navigation and Validation

  As a user
  I want to navigate through wordpress.org
  So that I can verify different functionalities

  @smoke
  Scenario: Verify WordPress homepage title
    Given the user launches the browser
    When the user navigates to "https://wordpress.org"
    Then the page title should be "Blog Tool, Publishing Platform, and CMS – WordPress.org"

  Scenario: Navigate to Get WordPress page
    Given the user is on the WordPress homepage "https://wordpress.org"
    When the user mouse hovers on Extend
    And clicks on Get WordPress
    Then the Get WordPress page should be displayed

  Scenario: Navigate to Photo Directory
    Given the user is on the WordPress homepage "https://wordpress.org"
    When the user clicks on Community
    And clicks on Photo Directory
    Then the Photo Directory page should be displayed

  @regression
  Scenario: Search for a picture in Photo Directory
    Given the user is on the "Photo Directory" page "https://wordpress.org/photos/"
    When the user searches for "nature"
    Then the pictures related to "nature" should be displayed