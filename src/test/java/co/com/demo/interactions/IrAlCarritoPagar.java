package co.com.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.demo.userinterfaces.PaginaCarrito.BOTON_PAGAR;
import static co.com.demo.userinterfaces.PaginaCarrito.CHECK_TERMINOS_CONDICIONES;
import static co.com.demo.userinterfaces.PaginaPrincipal.HEADER_CARRITO;
import static co.com.demo.userinterfaces.PaginaPrincipal.OPCION_HEADER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAlCarritoPagar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_HEADER.of(HEADER_CARRITO)),
                Click.on(CHECK_TERMINOS_CONDICIONES),
                Click.on(BOTON_PAGAR)
        );
    }

    public static IrAlCarritoPagar ir() {
        return instrumented(IrAlCarritoPagar.class);
    }
}
