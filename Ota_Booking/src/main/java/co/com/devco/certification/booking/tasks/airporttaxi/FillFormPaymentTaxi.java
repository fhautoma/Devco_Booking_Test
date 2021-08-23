package co.com.devco.certification.booking.tasks.airporttaxi;

import co.com.devco.certification.booking.models.airporttaxi.BookPaymentAirportTaxi;
import co.com.devco.certification.booking.models.airporttaxi.DetailAirportTaxi;
import co.com.devco.certification.booking.userinterfaces.airporttaxi.DetailPageAirportTaxi;
import co.com.devco.certification.booking.userinterfaces.airporttaxi.PaymentPageAirportTaxi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillFormPaymentTaxi implements Task {

    private final List<BookPaymentAirportTaxi> data;

    public FillFormPaymentTaxi(List<BookPaymentAirportTaxi> dtodata) {
        this.data = dtodata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PaymentPageAirportTaxi.CARD_NUMBER, isVisible()));
        actor.attemptsTo(Enter.theValue(data.get(0).getCardNumber()).into(PaymentPageAirportTaxi.CARD_NUMBER));
        actor.attemptsTo(Enter.theValue(data.get(0).getExpiryDate()).into(PaymentPageAirportTaxi.EXPIRY_DATE));
        actor.attemptsTo(Enter.theValue(data.get(0).getCvc()).into(PaymentPageAirportTaxi.CVC));

    }

    public static FillFormPaymentTaxi managePaymentTaxi(List<BookPaymentAirportTaxi> dtodata) {
        return new FillFormPaymentTaxi(dtodata);
    }
}
