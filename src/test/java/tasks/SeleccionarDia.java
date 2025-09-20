package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.DatepickerPage;
public class SeleccionarDia implements Task {

    private final int dia;
    public SeleccionarDia(int dia) {
        this.dia = dia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DatepickerPage.DIA(dia)));
    }
    public static SeleccionarDia delCalendario(int dia) {
        return new SeleccionarDia(dia);
    }
}
