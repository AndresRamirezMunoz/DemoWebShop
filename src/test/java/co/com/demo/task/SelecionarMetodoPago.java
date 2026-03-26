package co.com.demo.task;

import co.com.demo.interactions.PagarConTarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelecionarMetodoPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PagarConTarjetaCredito.pagar()
        );
    }

    public static SelecionarMetodoPago pagar() {
        return instrumented(SelecionarMetodoPago.class);
    }
}
