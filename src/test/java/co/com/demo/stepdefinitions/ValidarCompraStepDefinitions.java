package co.com.demo.stepdefinitions;

import co.com.demo.models.DatosEnvio;
import co.com.demo.models.DatosPago;
import co.com.demo.models.DatosPersonales;
import co.com.demo.questions.ValidarMensajeCompra;
import co.com.demo.task.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarCompraStepDefinitions {

    private EnvironmentVariables environmentVariables;

    @Dado("que el usuario inicia sesion en la pagina Demo Web Shop")
    public void queElUsuarioIniciaSesionEnLaPaginaDemoWebShop() {
        String baseUrl = environmentVariables.getProperty("webdriver.base.url");
        theActorInTheSpotlight().attemptsTo(
                Open.url(baseUrl),
                IniciarSesion.ir()
        );
    }

    @Cuando("selecciona una categoria {string} y subcategoria {string}")
    public void seleccionaUnaCategoriaYSubcategoria(String categoria, String subcategoria) {
        theActorInTheSpotlight().attemptsTo(
                IngresarCategoriaYSubcategoria.ir(categoria, subcategoria)
        );
    }

    @Y("agrega un producto a su carrito")
    public void agregaUnProductoASuCarrito() {
        theActorInTheSpotlight().attemptsTo(
                AgregarProductos.agregar()
        );
    }


    @Y("ingresa al carrito y realiza el checkout")
    public void ingresaAlCarritoYRealizaElCheckout() {
        theActorInTheSpotlight().attemptsTo(
                IniciarProcesoPago.ir()
        );
    }

    @Y("ingresa los datos para la entrega")
    public void ingresaLosDatosParaLaEntrega(List<DatosEnvio> listaDatos) {
        DatosEnvio datos = listaDatos.get(0);
        theActorInTheSpotlight().attemptsTo(
                IngresarDatosFormulario.ir(datos)
        );
    }

    @Y("selecciona la tarjeta de credito como metodo de pago")
    public void seleccionaLaTarjetaDeCreditoComoMetodoDePago() {
        theActorInTheSpotlight().attemptsTo(
                SelecionarMetodoPago.pagar()
        );
    }

    @Y("completa la informacion de pago")
    public void completaLaInformacionDePago(List<DatosPago> listaDatos) {
        DatosPago datos = listaDatos.get(0);
        theActorInTheSpotlight().attemptsTo(
                CompletarInformacionPago.completar(datos)
        );
    }

    @Entonces("visualiza un mensaje de confirmacion de compra exitosa")
    public void visualizaUnMensajeDeConfirmacionDeCompraExitosa() {
        theActorInTheSpotlight().should(
                seeThat(ValidarMensajeCompra.exitoso())
        );
    }
}
