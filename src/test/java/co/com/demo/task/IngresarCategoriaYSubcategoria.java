package co.com.demo.task;

import co.com.demo.interactions.IrCategoria;
import co.com.demo.interactions.IrSubcategoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCategoriaYSubcategoria implements Task {

    private final String CATEGORIA;
    private final String SUBCATEGORIA;

    public IngresarCategoriaYSubcategoria(String categoria, String subcategoria) {
        CATEGORIA = categoria;
        SUBCATEGORIA = subcategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IrCategoria.opcion(CATEGORIA),
                IrSubcategoria.opcion(SUBCATEGORIA)
        );
    }

    public static IngresarCategoriaYSubcategoria ir(String categoria, String subcategoria) {
        return instrumented(IngresarCategoriaYSubcategoria.class, categoria, subcategoria);
    }
}
