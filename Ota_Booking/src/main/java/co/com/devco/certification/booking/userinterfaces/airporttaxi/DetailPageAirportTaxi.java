package co.com.devco.certification.booking.userinterfaces.airporttaxi;

import net.serenitybdd.screenplay.targets.Target;

public class DetailPageAirportTaxi {

    public static final Target PASSENGER_TITLE = Target.the("Passenger title")
            .locatedBy("//select[@name='title']");

    public static final Target PASSENGER_FIRST_NAME = Target.the("Passenger first name")
            .locatedBy("//input[@name='firstName']");

    public static final Target PASSENGER_LAST_NAME = Target.the("Passenger last name")
            .locatedBy("//input[@name='lastName']");

    public static final Target PASSENGER_EMAIL = Target.the("Passenger email address")
            .locatedBy("//input[@name='email']");

    public static final Target PASSENGER_PHONE = Target.the("Passenger mobile phone")
            .locatedBy("//input[@name='contactNumber']");

    public static final Target CONTINUE_BUTTON = Target.the("Pickup date input field")
            .locatedBy("//button[@type='submit']");

    public static final Target TOTAL_PRICE = Target.the("Detail page total price text")
            .locatedBy("//div[@class='gb-c-price__value gb-c-price__value--default ui-bui-largest-bold']");
}
