package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatepickerPage {

    public static final Target CAMPO_FECHA = Target.the("campo de seleccion de fecha").located(By.id("datepicker"));
    public static final Target BTN_SIGUIENTE = Target.the("boton siguiente del calendario").located(By.cssSelector(".ui-datepicker-next"));
    public static final Target IFRAME_CALENDARIO = Target.the("iframe del calendario").located(By.cssSelector(".demo-frame"));
    public static final Target DIA(int dia) {
        return Target.the("dia" + dia + " del calendario ")
                .located(By.xpath("//a[text()='" + dia + "']"));
    }

}



