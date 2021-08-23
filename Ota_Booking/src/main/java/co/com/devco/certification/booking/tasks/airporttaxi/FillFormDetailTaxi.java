package co.com.devco.certification.booking.tasks.airporttaxi;

import co.com.devco.certification.booking.models.airporttaxi.DetailAirportTaxi;
import co.com.devco.certification.booking.userinterfaces.airporttaxi.DetailPageAirportTaxi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.server.handler.GetElementText;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillFormDetailTaxi implements Task {
    private final List<DetailAirportTaxi> data;

    public FillFormDetailTaxi(List<DetailAirportTaxi> dtodata){

        this.data = dtodata;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DetailPageAirportTaxi.PASSENGER_FIRST_NAME, isVisible()));
        actor.attemptsTo(SelectFromOptions.byValue(data.get(0).getTitle()).from(DetailPageAirportTaxi.PASSENGER_TITLE));
        actor.attemptsTo(Enter.theValue(data.get(0).getFirstName()).into(DetailPageAirportTaxi.PASSENGER_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getLastName()).into(DetailPageAirportTaxi.PASSENGER_LAST_NAME));

        actor.attemptsTo(Enter.theValue(data.get(0).getEmailAddress()).into(DetailPageAirportTaxi.PASSENGER_EMAIL));
        actor.attemptsTo(Enter.theValue(data.get(0).getMobileNumber()).into(DetailPageAirportTaxi.PASSENGER_PHONE));
        actor.attemptsTo(Click.on(DetailPageAirportTaxi.CONTINUE_BUTTON));


    }

    public static FillFormDetailTaxi manageDetailTaxi(List<DetailAirportTaxi> dtodata) {
        //return Tasks.instrumented(SearchTaxi.class);
        return new FillFormDetailTaxi(dtodata);
    }
}
