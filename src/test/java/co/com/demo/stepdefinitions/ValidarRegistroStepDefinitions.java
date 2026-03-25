package co.com.demo.stepdefinitions;

import co.com.demo.models.DatosPersonales;
import co.com.demo.questions.ValidarMensajeRegistro;
import co.com.demo.task.RealizarRegistro;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarRegistroStepDefinitions {


    @Managed(driver = "chrome")
    WebDriver hisBrowser;
    private EnvironmentVariables environmentVariables;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("UsuarioFinal")
                .can(BrowseTheWeb.with(hisBrowser));
    }


    @Dado("que el usuario ingresa al portal")
    public void queElUsuarioIngresaAlPortal() {
        String baseUrl = environmentVariables.getProperty("webdriver.base.url");
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url(baseUrl)
        );
    }

    @Cuando("se registra con sus datos personales")
    public void seRegistraConSusDatosPersonales(List<DatosPersonales> listaDatos) {
        DatosPersonales datos = listaDatos.get(0);
        theActorInTheSpotlight().attemptsTo(
                RealizarRegistro.conDatos(datos)
        );
    }

    @Entonces("visualiza un mensaje de confirmación de registro exitoso")
    public void visualizaUnMensajeDeConfirmaciónDeRegistroExitoso() {
        theActorInTheSpotlight().should(seeThat(ValidarMensajeRegistro.exitoso()));
    }

}
