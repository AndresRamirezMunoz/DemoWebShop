package co.com.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.demo.userinterfaces.FormularioRegistro.*;

public class ValidarMensajeRegistro implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_REGISTRO.resolveFor(actor).getText().equals(MENSAJE_REGISTRO_EXITOSO);
    }

    public static ValidarMensajeRegistro exitoso() {
        return new ValidarMensajeRegistro();
    }
}
