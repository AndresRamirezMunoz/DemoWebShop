package co.com.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaProductos {

    public static final String OPCIONES_HDD = "HDD";
    public static final String OPCIONES_PROCESSOR = "Processor";

    public static final Target PRODUCTOS = the("Productos disponibles")
            .locatedBy(".add-info div[class='buttons'] > input");
    public static final Target BOTON_AGREGAR_CARRITO = the("Boton para agregar al carrito")
            .locatedBy(".add-to-cart-panel > input[value='Add to cart']");
    public static final Target OPCION_CONFIGURACION =
            Target.the("Opciones de configuracion {0}")
                    .locatedBy("//label[normalize-space()='{0}']/ancestor::dt/following-sibling::dd[1]//input");

}
