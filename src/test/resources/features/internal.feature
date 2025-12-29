Feature: Internal API Verification
  Verify that internal APIs return valid responses according to the defined JSON schema.

  Background:
    Given I have a valid bearer token

  Scenario: Verify Internal Trips API returns valid response
    When I call the Internal Trips API
    Then the response status code should be 200
    And the response should match the "InternalTrips" JSON schema

  Scenario: Verify Edit Trips API returns valid response
    When I call the Edit Trips API
    Then the response status code should be 200
    And the response should match the "EditTrip" JSON schema

  Scenario: Verify Vehicle Search API returns valid response
    When I call the Vehicle Search API with vehicle number "NL01" and status "1"
    Then the response status code should be 200
    And the response should match the "VehicleSearch" JSON schema

  Scenario: Verify Trip Conflict Bookings API returns valid response
    When I call the Trip Conflict Bookings API with "all" Details
    Then the response status code should be 200
    And the response should match the "TripConflictBooking" JSON schema
    Then booking_count should match the number of bookings in booking_list

  Scenario: Verify PNR Details API returns valid response
    When I call the PNR Details API
    Then the response status code should be 200
    And the response should match the "PnrDetails" JSON schema

