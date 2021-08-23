package co.com.devco.certification.booking.userinterfaces.airporttaxi;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPageAirportTaxi {

    public static final Target CARD_NUMBER = Target.the("Card number")
            .locatedBy("//input[@id='cc-number']");

    public static final Target EXPIRY_DATE = Target.the("Expiration date")
            .locatedBy("//input[@id='expiry-date']");

    public static final Target CVC = Target.the("Card verification code")
            .locatedBy("//input[@name='payments[cc_cvc]']");


}
