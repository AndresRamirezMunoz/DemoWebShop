package co.com.demo.task;

import co.com.demo.interactions.IngresarIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarIniciarSesion.conCredenciales()
        );
    }

    public static IniciarSesion ir() {
        return instrumented(IniciarSesion.class);
    }
}
