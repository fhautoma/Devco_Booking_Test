package co.com.devco.certification.booking.tasks.airporttaxi;

import co.com.devco.certification.booking.models.airporttaxi.SearchAirportTaxi;
import co.com.devco.certification.booking.userinterfaces.airporttaxi.SearchPageAirportTaxi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

public class SearchTaxi implements Task {

    private final List<SearchAirportTaxi> data;

    public SearchTaxi(List<SearchAirportTaxi> dtodata){

        this.data = dtodata;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getPickupLocation()).into(SearchPageAirportTaxi.PICKUP_LOCATION),
                Click.on(SearchPageAirportTaxi.FIRST_AUTO_COMPLETE_ITEM));
        actor.attemptsTo(Enter.theValue(data.get(0).getDropOffLocation()).into(SearchPageAirportTaxi.DROP_OFF_LOCATION),
                Click.on(SearchPageAirportTaxi.FIRST_AUTO_COMPLETE_ITEM));
        actor.attemptsTo(Click.on(SearchPageAirportTaxi.SEARCH_BUTTON));
    }

    public static SearchTaxi searchTaxi(List<SearchAirportTaxi> dtodata) {
        //return Tasks.instrumented(SearchTaxi.class);
        return new SearchTaxi(dtodata);
    }

}
