#Author: Andres Felipe Henao Palacio
  Feature: booking airport taxis
    I as a quality engineer
    Want to execute a booking flow to the airport taxis module
    To validate the prices

    Scenario: Validate correct prices at one way airport taxi flow
      Given I am on the airport taxi booking page
        And I search a taxi with the search data
          |pickupLocation                 |dropOffLocation |pickupDate |pickupTime |passengers |
          |El Dorado International Airport|Parque de la 93 |31/08/2021 |13:00      |1          |
        And I fill the passenger details form with the values
          |title                 |firstName |lastName |emailAddress |mobileNumber            |
          |Mr                    |Felipe    |Henao    |a@gmail.com  |+57 313 6555421         |
      When I get the total price in the passenger details page
        And I clicking the continue to book button
        And I get the total price in the payment page
      Then I should see the total price is equal to the passenger details page total price




