package co.com.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaInicioSesion {

    public static final Target CAMPO_CORREO = the("Campo correo")
            .located(By.id("Email"));
    public static final Target CAMPO_CONTRASENA = the("Campo contrasena")
            .located(By.id("Password"));
    public static final Target BOTON_INICIAR_SESION = the("Boton iniciar sesion")
            .locatedBy("//input[@value='Log in']");
}
