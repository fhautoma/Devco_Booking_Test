package co.com.devco.certification.booking.userinterfaces.airporttaxi;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.booking.com/taxi")

public class SearchPageAirportTaxi extends PageObject {
    public static final Target RADIO_ONE_WAY = Target.the("One-way input radio")
            .locatedBy("//input[@id='returnJourneyNegative']");

    public static final Target RADIO_RETURN = Target.the("Return input radio")
            .locatedBy("//input[@id='returnJourneyAffirmative']");

    public static final Target PICKUP_LOCATION = Target.the("Pickup location text field")
            .locatedBy("//input[@id='pickupLocation']");

    public static final Target DROP_OFF_LOCATION = Target.the("Drop off location text field")
            .locatedBy("//input[@id='dropoffLocation']");

    public static final Target PICKUP_DATE = Target.the("Pickup date input field")
            .locatedBy("//button[@aria-label='pickup date input field']");

    public static final Target DATE_PICKER   = Target.the("Date picker calendar")
            .locatedBy("//table[@class='rw-c-date-picker__calendar rw-o-table--fixed']");

    public static final Target PICKUP_TIME = Target.the("Pickup time input field")
            .locatedBy("//button[@aria-label='pickup time input field']");

    public static final Target PICKUP_HOUR = Target.the("Time picker hour")
            .locatedBy("//select[@id='pickupHour']");

    public static final Target TIME_PICKER_CONFIRM_BUTTON = Target.the("Confirm button")
            .locatedBy("//button[@class='rw-time-picker__confirm']");

    public static final Target PASSENGER = Target.the("Passenger interactive field")
            .locatedBy("//select[@id='passengers']");

    public static final Target SEARCH_BUTTON = Target.the("Form search button")
            .locatedBy("//button[@name='searchButton]");

}
