package co.com.demo.task;

import co.com.demo.interactions.LlenarFormularioEnvio;
import co.com.demo.models.DatosEnvio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatosFormulario implements Task {

    private final DatosEnvio DATOS;

    public IngresarDatosFormulario(DatosEnvio datos) {
        DATOS = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LlenarFormularioEnvio.conDatos(DATOS)
        );
    }

    public static IngresarDatosFormulario ir(DatosEnvio datos) {
        return instrumented(IngresarDatosFormulario.class, datos);

    }
}
