package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.DatepickerPage.CAMPO_FECHA;

public class AbrirCampoFecha implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CAMPO_FECHA));
    }
    public static AbrirCampoFecha delCalendario() {
        return new AbrirCampoFecha();
    }
}
