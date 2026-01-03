Feature: Internal API Verification
  Verify that internal APIs return valid responses according to the defined JSON schema.

  Background:
    Given I have a valid bearer token

  Scenario: Verify Internal Trips API returns valid response
    When I call the Internal Trips API
    Then the response status code should be 200
    And the "internal" Api response should match the "InternalTrips" JSON schema

  Scenario: Verify Edit Trips API returns valid response
    When I call the Edit Trips API for Trip Id "59593"
    Then the response status code should be 200
    And the "internal" Api response should match the "EditTrip" JSON schema

  Scenario: Verify Vehicle Search API returns valid response
    When I call the Vehicle Search API with vehicle number "NL01" and status "1"
    Then the response status code should be 200
    And the "internal" Api response should match the "VehicleSearch" JSON schema

  Scenario: Verify Trip Conflict Bookings API returns valid response
    When I call the Trip Conflict Bookings API for Trip Id "59593" with "all" Details
    Then the response status code should be 200
    And the "internal" Api response should match the "TripConflictBooking" JSON schema
    Then booking_count should match the number of bookings in booking_list

  Scenario: Verify PNR Details API returns valid response
    When I call the PNR Details API for a given PNR number "7TIH46BFFBLP"
    Then the response status code should be 200
    And the "internal" Api response should match the "PnrDetails" JSON schema

  Scenario: Verify Trip Details API returns valid response
    When I call the Trip Details API with Trip Id "187813" , Sub Trip Id "6060429" and Date of Journey "2025-12-30"
    Then the response status code should be 200
    And the "internal" Api response should match the "TripDetails" JSON schema

  Scenario: Verify Trip Suggestion API returns valid response
    When I call the Trip Suggestion API with Booking Id "695375d0c2e3ecdd5e7221b6"
    Then the response status code should be 200
    And the "internal" Api response should match the "TripSuggestions" JSON schema

  Scenario: Verify Edit Bookings API returns valid response
    When I call the Edit Bookings API with Trip Id "188093"
    Then the response status code should be 200
    And the "internal" Api response should match the "EditBookings" JSON schema

  Scenario: Verify Booking Details API returns valid response
    When I call the Booking Details API with Booking Id "695375d0c2e3ecdd5e7221b6"
    Then the response status code should be 200
    And the "internal" Api response should match the "BookingDetails" JSON schema

  Scenario: Verify Service Template API returns valid response
    When I call the Service Template API For From City "315", To City "811" With Service Id "1234"
    Then the response status code should be 200
    And the "internal" Api response should match the "ServiceTemplates" JSON schema

  Scenario: Verify Service Details API returns valid response
    When I call the Service Details API with Service Id "1643"
    Then the response status code should be 200
    And the "internal" Api response should match the "ServiceDetails" JSON schema

  Scenario: Verify Hop Search API returns valid response
    When I call the Hop Search API For City "315" and Hop Name "Red Fort"
    Then the response status code should be 200
    And the "internal" Api response should match the "HopSearch" JSON schema

  Scenario: Verify Coach Layout API returns valid response
    When I call the Coach Layout API For Coach Id "114" and Status "1"
    Then the response status code should be 200
    And the "internal" Api response should match the "CoachLayout" JSON schema

  Scenario: Verify Service Fare API returns valid response
    When I call the Service Fare API For From City "315", To City "811" With Service Id "650"
    Then the response status code should be 200
    And the "internal" Api response should match the "ServiceFares" JSON schema

  Scenario: Verify Coach Search API returns valid response
    When I call the Coach Search API For Coach Name "42-Capacity-28 Double Sleeper-14"
    Then the response status code should be 200
    And the "internal" Api response should match the "CoachSearch" JSON schema

  Scenario: Verify Hop Details API returns valid response
    When I call the Hop Details API For Hop Id "40"
    Then the response status code should be 200
    And the "internal" Api response should match the "HopDetails" JSON schema

  Scenario: Verify City Search API returns valid response
    When I call the City Search API For City "Delhi"
    Then the response status code should be 200
    And the "internal" Api response should match the "CitySearch" JSON schema

  Scenario: Verify City Details API returns valid response
    When I call the City Details API For City Id "1258"
    Then the response status code should be 200
    And the "internal" Api response should match the "CityDetails" JSON schema

  Scenario: Verify Route Search API returns valid response
    When I call the Route Search API For City "Delhi"
    Then the response status code should be 200
    And the "internal" Api response should match the "RouteSearch" JSON schema

  Scenario: Verify Route Details API returns valid response
    When I call the Route Details API For City Id "1688"
    Then the response status code should be 200
    And the "internal" Api response should match the "RouteDetails" JSON schema

  Scenario: Verify All Vehicles API returns valid response
    When I call the All Vehicles API
    Then the response status code should be 200
    And the "internal" Api response should match the "AllVehicles" JSON schema

  Scenario: Verify All Amenities API returns valid response
    When I call the All Amenities API
    Then the response status code should be 200
    And the "internal" Api response should match the "AllAmenities" JSON schema

  Scenario: Verify User Bookings API returns valid response
    When I call the User Bookings API For User Id "328"
    Then the response status code should be 200
    And the "internal" Api response should match the "UserBookings" JSON schema

  Scenario: Verify Trip Details V2 API returns valid response
    When I call the Trip Details V2 API with Trip Id "59623" , Sub Trip Id "1055440" and Date of Journey "2025-12-31"
    Then the response status code should be 200
    And the "internal" Api response should match the "TripDetailsV2" JSON schema

  Scenario: Verify Partial Booking API returns valid response
    When I call the Partial Booking API For Booking Id "69550e2dfebd00ad422f7243"
    Then the response status code should be 201
    And the "internal" Api response should match the "PartialBooking" JSON schema

  Scenario: Verify SME Ratings API returns valid response
    When I call the SME Ratings API For User Id "301"
    Then the response status code should be 200
    And the "internal" Api response should match the "SmeRatings" JSON schema

  Scenario: Verify Convenience Fees API returns valid response
    When I call the Convenience Fees API with From Stop Id "59623" , To Stop Id "1055440" , Service Id "1234" , Start Date "2025-12-30" and End Date "2025-12-31"
    Then the response status code should be 200
    And the "internal" Api response should match the "ConvenienceFees" JSON schema

  Scenario: Verify Search City API returns valid response
    When I call the Search City API with City Name "Delhi"
    Then the response status code should be 200
    And the "internal" Api response should match the "SearchCity" JSON schema

  Scenario: Verify Bus Staff API returns valid response
    When I call the Bus Staff API with Staff Role "captain" and  Name "Test"
    Then the response status code should be 200
    And the "internal" Api response should match the "BusStaff" JSON schema

  Scenario: Verify User Wallet API returns valid response
    When I call the User Wallet API with User Id "328"
    Then the response status code should be 200
    And the "internal" Api response should match the "UserWallet" JSON schema

  Scenario: Verify Wallet Transactions API returns valid response
    When I call the Wallet Transactions API with User Id "328"
    Then the response status code should be 200
    And the "internal" Api response should match the "WalletTransaction" JSON schema


