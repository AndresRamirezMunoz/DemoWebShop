package co.com.demo.task;

import co.com.demo.interactions.AgregarProductoAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AgregarProductoAleatorio.agregar()
        );
    }

    public static AgregarProductos agregar() {
        return instrumented(AgregarProductos.class);
    }
}
