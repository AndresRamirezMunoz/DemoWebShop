package co.com.demo.task;

import co.com.demo.interactions.LlenarFormularioRegistro;
import co.com.demo.models.DatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RealizarRegistro implements Task {

    private final DatosPersonales datos;

    public RealizarRegistro(DatosPersonales datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LlenarFormularioRegistro.conDatos(datos)
        );
    }

    public static RealizarRegistro conDatos(DatosPersonales datos) {
        return instrumented(RealizarRegistro.class, datos);
    }
}
