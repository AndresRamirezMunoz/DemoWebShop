package co.com.demo.interactions;

import co.com.demo.models.DatosEnvio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.PaginaPago.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LlenarFormularioEnvio implements Interaction {

    private final DatosEnvio DATOS;

    public LlenarFormularioEnvio(DatosEnvio datos) {
        DATOS = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_DIRECCION, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_DIRECCION),
                Click.on(ITEM_DIRECCION_NUEVA),
                Enter.theValue(DATOS.getCOMPANIA()).into(CAMPO_COMPANIA),
                Click.on(OPCION_PAIS),
                Click.on(ITEM_PAIS.of(DATOS.getPAIS())),
                Enter.theValue(DATOS.getCIUDAD()).into(CAMPO_CIUDAD),
                Enter.theValue(DATOS.getDIRECCION()).into(CAMPO_DIRECCION1),
                Enter.theValue(DATOS.getCODIGO_POSTAL()).into(CAMPO_CODIGO_POSTAL),
                Enter.theValue(DATOS.getTELEFONO()).into(CAMPO_TELEFONO),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR_ENVIO),
                Click.on(BOTON_CONTINUAR_METODO)
        );
    }

    public static LlenarFormularioEnvio conDatos(DatosEnvio datos) {
        return instrumented(LlenarFormularioEnvio.class, datos);
    }
}
