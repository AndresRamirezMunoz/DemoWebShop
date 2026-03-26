package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.PaginaInicioSesion.*;
import static co.com.demo.userinterfaces.PaginaPrincipal.HEADER_INICIAR_SESION;
import static co.com.demo.userinterfaces.PaginaPrincipal.OPCION_HEADER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IngresarIniciarSesion implements Interaction {

    private final String CORREO = System.getProperty("correo");
    private final String CONSTRASENA = System.getProperty("contrasena");

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_HEADER.of(HEADER_INICIAR_SESION), isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_HEADER.of(HEADER_INICIAR_SESION)),
                Enter.theValue(CORREO).into(CAMPO_CORREO),
                Enter.theValue(CONSTRASENA).into(CAMPO_CONTRASENA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IngresarIniciarSesion conCredenciales(){
        return instrumented(IngresarIniciarSesion.class);
    }

}
