package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.PaginaPrincipal.OPCION_SUBCATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrSubcategoria implements Interaction {

    private final String SUBCATEGORIA;

    public IrSubcategoria(String subcategoria) {
        SUBCATEGORIA = subcategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_SUBCATEGORIA.of(SUBCATEGORIA), isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SUBCATEGORIA.of(SUBCATEGORIA))
        );
    }

    public static IrSubcategoria opcion(String subcategoria) {
        return instrumented(IrSubcategoria.class, subcategoria);
    }
}
