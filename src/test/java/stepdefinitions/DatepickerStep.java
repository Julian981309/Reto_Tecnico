package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.*;
import questions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DatepickerStep {

    @Before
    public void setupDriver() {

        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Julian").can(BrowseTheWeb.with(new ChromeDriver()));
    }
    @Given("que el usuario abre la página del datepicker")
    public void queElUsuarioAbreLaPáginaDelDatepicker() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }
    @And("cambia al iframe del calendario")
    public void cambiaAlIframeDelCalendario() {
        OnStage.theActorInTheSpotlight().attemptsTo(CambiarAlIframe.delCalendario());
    }
    @When("hace clic en el campo de fecha")
    public void haceClicEnElCampoDeFecha() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirCampoFecha.delCalendario());
    }
    @And("selecciona el día {int} del calendario")
    public void seleccionaElDíaDelCalendario(int dia) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarDia.delCalendario(dia));
    }
    @Then("la fecha seleccionada debe ser {string}")
    public void laFechaSeleccionadaDebeSer(String fechaEsperada) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("La fecha mostrada en el campo",
                        FechaSeleccionada.enElCampo(),
                        equalTo(fechaEsperada))
        );
    }

    @And("navega al mes siguiente")
    public void navegaAlMesSiguiente() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavegarAlProximoMes.enCalendario());
    }
    @When("intenta ingresar una fecha manualmente en el campo de texto")
    public void intentaIngresarUnaFechaManual() {
        OnStage.theActorInTheSpotlight().attemptsTo(IntentoIngresarFecha.conElValor("12/15/2025"));
    }
    @Then("el campo de texto no debe permitir la entrada manual")
    public void validarCampoBloqueado() {
        String valorCampo = FechaSeleccionada.enElCampo().answeredBy(OnStage.theActorInTheSpotlight());

        if (!valorCampo.isEmpty()) {
            throw new AssertionError("El campo de fecha permite la entrada manual. Valor actual: " + valorCampo);
        }
    }


}
