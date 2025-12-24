Feature: Internal Trips API verification

  Scenario: Verify internal trips API returns valid trips
    Given I have a valid bearer token
    And I call internal trips API
    Then response status code should be 200
    Then the response should match the trips JSON schema
