package co.com.demo.interactions;

import co.com.demo.utils.ElementosAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterfaces.PaginaPrincipal.OPCION_CARRITO_CON_PRODUCTOS;
import static co.com.demo.userinterfaces.PaginaProductos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductoAleatorio implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ElementosAleatorio.productoAleatorio(actor)),
                configurarEspecificaciones.selecionar(OPCIONES_HDD),
                configurarEspecificaciones.selecionar(OPCIONES_PROCESSOR),
                Click.on(BOTON_AGREGAR_CARRITO),
                WaitUntil.the(OPCION_CARRITO_CON_PRODUCTOS, isVisible()).forNoMoreThan(10).seconds(),
                RegresarPagina.ir()
        );
    }

    public static AgregarProductoAleatorio agregar() {
        return instrumented(AgregarProductoAleatorio.class);
    }
}
