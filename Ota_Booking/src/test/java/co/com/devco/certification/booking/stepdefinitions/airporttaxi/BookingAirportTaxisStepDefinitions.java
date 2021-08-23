package co.com.devco.certification.booking.stepdefinitions.airporttaxi;

import co.com.devco.certification.booking.models.airporttaxi.BookPaymentAirportTaxi;
import co.com.devco.certification.booking.models.airporttaxi.DetailAirportTaxi;
import co.com.devco.certification.booking.models.airporttaxi.SearchAirportTaxi;
import co.com.devco.certification.booking.tasks.airporttaxi.FillFormDetailTaxi;
import co.com.devco.certification.booking.tasks.airporttaxi.FillFormPaymentTaxi;
import co.com.devco.certification.booking.tasks.airporttaxi.SearchTaxi;
import co.com.devco.certification.booking.userinterfaces.airporttaxi.SearchPageAirportTaxi;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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
        theActorInTheSpotlight().attemptsTo(Open.browserOn(new SearchPageAirportTaxi()));

    }

    @And("^I search a taxi with the search data$")
    public void iSearchATaxiWithTheSearchData(List<SearchAirportTaxi> data) {
        theActorInTheSpotlight().attemptsTo(SearchTaxi.searchTaxi(data));

    }

    @And("^I fill the passenger details form with the values$")
    public void iFillThePassengerDetailsFormWithTheValues(List<DetailAirportTaxi> data) {
        theActorInTheSpotlight().attemptsTo(FillFormDetailTaxi.manageDetailTaxi(data));

    }

    @When("^I fill the payment data with the values$")
    public void iFillThePaymentDataWithTheValues(List<BookPaymentAirportTaxi> data) {
        theActorInTheSpotlight().attemptsTo(FillFormPaymentTaxi.managePaymentTaxi(data));


    }

    @Then("^I should see the error payment message$")
    public void iShouldSeeTheErrorPaymentMessage() {

    }
}
