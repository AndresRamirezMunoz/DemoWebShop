package co.com.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.demo.userinterfaces.PaginaPago.*;

public class ValidarMensajeCompra implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CAMPO_CONFIRMACION.resolveFor(actor).getText().contains(MENSAJE_CONFIRMACION_COMPRA);
    }

    public static ValidarMensajeCompra exitoso() {
        return new ValidarMensajeCompra();
    }
}
