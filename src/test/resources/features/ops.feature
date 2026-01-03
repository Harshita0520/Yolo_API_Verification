Feature: OPS API Verification
  Verify that Ops APIs return valid responses according to the defined JSON schema.

  Background:
    Given I have a valid bearer token

  Scenario: Verify Driver API returns valid response
    When I call the Driver API with Driver Name "Rajat"
    Then the response status code should be 200
    And the "ops" Api response should match the "Driver" JSON schema

  Scenario: Verify Captain API returns valid response
    When I call the Captain API with Captain Name "Rajat"
    Then the response status code should be 200
    And the "ops" Api response should match the "Captain" JSON schema

  Scenario: Verify Ground Ops API returns valid response
    When I call the Ground Ops API with Ground Ops Name "Rajat"
    Then the response status code should be 200
    And the "ops" Api response should match the "GroundOps" JSON schema

  Scenario: Verify Ground Trips API returns valid response
    When I call the Ground Trips API with start date "2026-01-03", end date "2026-01-04" and Service Id "1643"
    Then the response status code should be 200
    And the "ops" Api response should match the "GroundTrip" JSON schema

  Scenario: Verify Ground Vehicle API returns valid response
    When I call the Ground Vehicle API with Vehicle Number "NL01"
    Then the response status code should be 200
    And the "ops" Api response should match the "GroundVehicle" JSON schema

  Scenario: Verify Partner Pnr API returns valid response
    When I call the Partner Pnr API with Trip Id "1643"
    Then the response status code should be 200
    And the "ops" Api response should match the "PartnerPnr" JSON schema