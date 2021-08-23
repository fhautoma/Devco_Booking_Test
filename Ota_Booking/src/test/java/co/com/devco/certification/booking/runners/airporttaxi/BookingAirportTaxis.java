package co.com.devco.certification.booking.runners.airporttaxi;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        glue = "co.com.devco.certification.booking.stepdefinitions.airporttaxi",
        features = "src/test/resources/features/booking_airport_taxis.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class BookingAirportTaxis {
}
