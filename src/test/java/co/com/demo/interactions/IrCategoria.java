package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.PaginaPrincipal.OPCION_CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrCategoria implements Interaction {

    private final String CATEGORIA;

    public IrCategoria(String categoria) {
        CATEGORIA = categoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_CATEGORIA.of(CATEGORIA), isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_CATEGORIA.of(CATEGORIA))
        );
    }

    public static IrCategoria opcion(String categoria) {
        return instrumented(IrCategoria.class, categoria);
    }
}
