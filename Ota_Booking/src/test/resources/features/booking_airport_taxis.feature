#Author: Andres Felipe Henao Palacio
  Feature: booking airport taxis
    I as a quality engineer
    Want to execute a booking flow to the airport taxis module
    To validate the prices

    Scenario: Validate correct prices at one way airport taxi flow
      Given I am on the airport taxi booking page
        And I search a taxi with the search data
          |pickupLocation                       |dropOffLocation |
          |Aeropuerto internacional de El Dorado|Parque de la 93 |
        And I fill the passenger details form with the values
          |title|firstName |lastName |emailAddress |mobileNumber   |
          |Mr   |Felipe    |Henao    |a@gmail.com  |+57 313 6555421|
      When I fill the payment data with the values
        |cardNumber         |expiryDate |cvc |
        |4111 1111 1111 1111|0527       |785 |
      Then I should see the error payment message




