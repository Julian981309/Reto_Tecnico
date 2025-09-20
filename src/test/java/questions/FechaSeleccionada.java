package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.DatepickerPage.CAMPO_FECHA;

public class FechaSeleccionada implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CAMPO_FECHA.resolveFor(actor).getValue();
    }
    public static FechaSeleccionada enElCampo() {
        return new FechaSeleccionada();
    }
}
