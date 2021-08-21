package co.com.devco.certification.booking.stepdefinitions.airporttaxi;

import co.com.devco.certification.booking.userinterfaces.airporttaxi.SearchPageAirportTaxi;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.certification.booking.utils.ConstantManager.AUTOMATION_USER;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BookingAirportTaxisStepDefinitions {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled(AUTOMATION_USER);
    }

    @Given("^I am on the airport taxi booking page$")
    public void iAmOnTheAirportTaxiBookingPage() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new SearchPageAirportTaxi()));

    }

    @Given("^I search a taxi with the search data$")
    public void iSearchATaxiWithTheSearchData(DataTable arg1) {

    }

    @Given("^I fill the passenger details form with the values$")
    public void iFillThePassengerDetailsFormWithTheValues(DataTable arg1) {

    }

    @When("^I get the total price in the passenger details page$")
    public void iGetTheTotalPriceInThePassengerDetailsPage() {

    }

    @When("^I clicking the continue to book button$")
    public void iClickingTheContinueToBookButton() {

    }

    @When("^I get the total price in the payment page$")
    public void iGetTheTotalPriceInThePaymentPage() {

    }

    @Then("^I should see the total price is equal to the passenger details page total price$")
    public void iShouldSeeTheTotalPriceIsEqualToThePassengerDetailsPageTotalPrice() {

    }
}
