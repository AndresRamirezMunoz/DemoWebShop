package co.com.demo.interactions;

import co.com.demo.models.DatosPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.PaginaPago.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CompletarInformacionPagoTC implements Interaction {


    private final DatosPago DATOS;

    public CompletarInformacionPagoTC(DatosPago datos) {
        DATOS = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_TARJETA, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_TARJETA),
                Click.on(ITEM_TARJETA.of(DATOS.getTIPO_TARJETA())),
                Enter.theValue(DATOS.getNOMBRE_TARJETA()).into(CAMPO_NOMBRE_TARJETA),
                Enter.theValue(DATOS.getNUMERO_TARJETA()).into(CAMPO_NUMERO_TARJETA),
                Click.on(OPCION_MES_EXPIRACION),
                Click.on(OPCION_MES.of(DATOS.getMES())),
                Click.on(OPCION_ANNO_EXPIRACION),
                Click.on(OPCION_ANNO.of(DATOS.getANNO())),
                Enter.theValue(DATOS.getCODIGO()).into(CAMPO_CODIGO_TARJETA),
                Click.on(BOTON_CONTINUAR_TC),
                Scroll.to(BOTON_CONFIRMAR),
                Click.on(BOTON_CONFIRMAR)
        );
    }

    public static CompletarInformacionPagoTC completar(DatosPago datos) {
        return instrumented(CompletarInformacionPagoTC.class, datos);
    }
}
