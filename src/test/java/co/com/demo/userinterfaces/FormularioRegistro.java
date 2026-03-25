package co.com.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class FormularioRegistro {

    public static final String MENSAJE_REGISTRO_EXITOSO = "Your registration completed";

        public static final Target INPUT_GENERO = the("Input genero")
            .locatedBy("//input[@id='gender-{0}']");
    public static final Target CAMPO_NOMBRE = the("Campo nombre")
            .located(By.id("FirstName"));
    public static final Target CAMPO_APELLIDO = the("Campo apellido")
            .located(By.id("LastName"));
    public static final Target CAMPO_CORREO = the("Campo correo")
            .located(By.id("Email"));
    public static final Target CAMPO_CONTRASENA = the("Campo contraseña")
            .located(By.id("Password"));
    public static final Target CAMPO_CONFIRMAR_CONTRASENA = the("Campo confirmar contraseña")
            .located(By.id("ConfirmPassword"));
    public static final Target BOTON_REGISTRAR = the("BotoN registrar")
            .located(By.id("register-button"));
    public static final Target MENSAJE_REGISTRO = the("Mensaje registro exitoso")
            .locatedBy(" //div[@class='result']");









}
