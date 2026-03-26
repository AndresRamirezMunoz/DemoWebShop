package co.com.demo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaPrincipal {

    public static final String HEADER_REGISTRO = "/register";
    public static final String HEADER_CARRITO = "/cart";
    public static final String HEADER_INICIAR_SESION = "/login";

    public static final Target OPCION_HEADER = the("opcion registro")
            .locatedBy("//a[@href='{0}']");
    public static final Target OPCION_CARRITO_CON_PRODUCTOS = Target.the("Carrito con productos")
            .locatedBy("[href='/cart'] > .cart-qty");
    public static final Target OPCION_CATEGORIA = Target.the("Categoria {0}")
            .locatedBy(".list > li > a[href='/{0}']");
    public static final Target OPCION_SUBCATEGORIA = Target.the("SubCategoria {0}")
            .locatedBy(".list > li > ul >li > a[href='/{0}']");



}
