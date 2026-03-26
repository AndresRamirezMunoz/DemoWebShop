package co.com.demo.task;

import co.com.demo.interactions.IrAlCarritoPagar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarProcesoPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IrAlCarritoPagar.ir()
        );
    }

    public static IniciarProcesoPago ir() {
        return instrumented(IniciarProcesoPago.class);
    }
}
