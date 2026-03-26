package co.com.demo.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.demo.userinterfaces.PaginaProductos.OPCION_CONFIGURACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class configurarEspecificaciones implements Interaction {

    private final String OPCION;

    public configurarEspecificaciones(String opcion) {
        OPCION = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> opciones = OPCION_CONFIGURACION.of(OPCION).resolveAllFor(actor);
        boolean seleccionado = opciones.stream().anyMatch(WebElementFacade::isSelected);
        if (!seleccionado && !opciones.isEmpty()) {
            actor.attemptsTo(Click.on(opciones.get(0))
            );
        }
    }

    public static configurarEspecificaciones selecionar(String opcion) {
        return instrumented(configurarEspecificaciones.class, opcion);
    }
}
