package co.com.demo.task;

import co.com.demo.interactions.CompletarInformacionPagoTC;
import co.com.demo.models.DatosPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarInformacionPago implements Task {

    private final  DatosPago DATOS;

    public CompletarInformacionPago(DatosPago datos) {
        DATOS = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CompletarInformacionPagoTC.completar(DATOS)
        );
    }

    public static CompletarInformacionPago completar( DatosPago datos){
        return  instrumented(CompletarInformacionPago.class, datos);
    }
}
