package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.experimental.theories.Theories;

import static co.com.demo.userinterfaces.PaginaPago.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PagarConTarjetaCredito implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CHECK_TARJETA_CREDITO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CHECK_TARJETA_CREDITO),
                Click.on(BOTON_CONTINUAR_PAGO)
        );
    }

    public static PagarConTarjetaCredito pagar() {
        return instrumented(PagarConTarjetaCredito.class);
    }
}
