package co.com.demo.interactions;

import co.com.demo.models.DatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.FormularioRegistro.*;
import static co.com.demo.userinterfaces.PaginaPrincipal.OPCION_REGISTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LlenarFormulario implements Interaction {

    private final DatosPersonales DATOS;

    public LlenarFormulario(DatosPersonales datos) {
        this.DATOS = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OPCION_REGISTRO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_REGISTRO),
                Click.on(INPUT_GENERO.of(DATOS.getGENERO())),
                Enter.theValue(DATOS.getNOMBRE()).into(CAMPO_NOMBRE),
                Enter.theValue(DATOS.getAPELLIDO()).into(CAMPO_APELLIDO),
                Enter.theValue(DATOS.getCORREO()).into(CAMPO_CORREO),
                Enter.theValue(DATOS.getCONTRASENA()).into(CAMPO_CONTRASENA),
                Enter.theValue(DATOS.getCONTRASENA()).into(CAMPO_CONFIRMAR_CONTRASENA),
                Click.on(BOTON_REGISTRAR)
        );
    }

    public static LlenarFormulario conDatos(DatosPersonales datos) {
        return instrumented(LlenarFormulario.class, datos);
    }
}
