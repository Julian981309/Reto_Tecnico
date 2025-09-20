package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static userinterfaces.DatepickerPage.*;


public class CambiarAlIframe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement iframeElement = IFRAME_CALENDARIO.resolveFor(actor);
        driver.switchTo().frame(iframeElement);
    }
    public static CambiarAlIframe delCalendario() {
        return new CambiarAlIframe();
    }
}
