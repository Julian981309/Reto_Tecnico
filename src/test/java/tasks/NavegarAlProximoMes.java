package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.DatepickerPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.DatepickerPage.BTN_SIGUIENTE;


public class NavegarAlProximoMes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SIGUIENTE, isVisible()).
                        forNoMoreThan(10).seconds(),
                Click.on(DatepickerPage.BTN_SIGUIENTE));
    }
    public static NavegarAlProximoMes enCalendario() {
        return new NavegarAlProximoMes();
    }
}
