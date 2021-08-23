package co.com.devco.certification.booking.questions.airporttaxi;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class BookMessage implements Question<String>{

    private Target target;

    public BookMessage(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static BookMessage getText(Target target){
        return new BookMessage(target);
    }

}
