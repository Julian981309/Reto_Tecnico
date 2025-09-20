package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterfaces.DatepickerPage;
public class IntentoIngresarFecha implements Task {
    private final String fecha;
    public IntentoIngresarFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DatepickerPage.CAMPO_FECHA));

        for (char c : fecha.toCharArray()) {
            actor.attemptsTo(
                    SendKeys.of(String.valueOf(c)).into(DatepickerPage.CAMPO_FECHA)
            );
        }
    }
    public static IntentoIngresarFecha conElValor(String fecha) {
        return new IntentoIngresarFecha(fecha);
    }


}
