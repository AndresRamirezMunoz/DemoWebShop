package co.com.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaCarrito {

    public static final Target CHECK_TERMINOS_CONDICIONES = the("Check de terminos y condiciones")
            .located(By.id("termsofservice"));
    public static final Target BOTON_PAGAR = the("Boton pagar")
            .located(By.id("checkout"));
}
