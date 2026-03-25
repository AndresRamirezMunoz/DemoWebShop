package co.com.demo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaPrincipal {


    public static final Target OPCION_REGISTRO = the("opcion registro")
            .locatedBy("//a[@href='/register']");

}
