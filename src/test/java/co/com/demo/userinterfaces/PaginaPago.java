package co.com.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaPago {

    public static final String MENSAJE_CONFIRMACION_COMPRA = "Your order has been successfully processed!";


    public static final Target OPCION_DIRECCION = the("Opcion de direccion")
            .located(By.id("billing-address-select"));
    public static final Target ITEM_DIRECCION_NUEVA = the("Opcion pais {0}")
            .locatedBy("//option[text()='New Address']");

    public static final Target CAMPO_COMPANIA = the("Campo compania")
            .located(By.id("BillingNewAddress_Company"));
    public static final Target OPCION_PAIS = the("Select pais")
            .located(By.id("BillingNewAddress_CountryId"));
    public static final Target ITEM_PAIS = the("Opcion pais {0}")
            .locatedBy("//option[text()='{0}']");
    public static final Target CAMPO_CIUDAD = the("Campo ciudad")
            .located(By.id("BillingNewAddress_City"));
    public static final Target CAMPO_DIRECCION1 = the("Campo direccion1")
            .located(By.id("BillingNewAddress_Address1"));
    public static final Target CAMPO_CODIGO_POSTAL = the("Campo codigo postal")
            .located(By.id("BillingNewAddress_ZipPostalCode"));
    public static final Target CAMPO_TELEFONO = the("Campo numero telefono")
            .located(By.id("BillingNewAddress_PhoneNumber"));
    public static final Target BOTON_CONTINUAR = the("Boton continuar")
            .locatedBy("#billing-buttons-container input[type='button']");
    public static final Target BOTON_CONTINUAR_ENVIO = the("Boton continuar desde direccion")
            .locatedBy("#shipping-buttons-container input[type='button']");
    public static final Target BOTON_CONTINUAR_METODO = the("Boton continuar desde metodo direccion2")
            .locatedBy("#shipping-method-buttons-container input[type='button']");

    public static final Target BOTON_CONTINUAR_PAGO = the("Boton continuar desde metodo envio")
            .locatedBy("#payment-method-buttons-container input[type='button']");
    public static final Target CHECK_TARJETA_CREDITO = the("Check tarjeta de credito")
            .located(By.id("paymentmethod_2"));



    public static final Target OPCION_TARJETA = the("Select tarjeta")
            .located(By.id("CreditCardType"));
    public static final Target ITEM_TARJETA = the("Opcion de tarjeta {0} ")
            .locatedBy("//option[@value='{0}']");
    public static final Target CAMPO_NOMBRE_TARJETA = the("Campo nombre tarjeta")
            .located(By.id("CardholderName"));
    public static final Target CAMPO_NUMERO_TARJETA = the("Campo ciudad")
            .located(By.id("CardNumber"));
    public static final Target OPCION_MES_EXPIRACION = the("Opcion mes de expiracion")
            .located(By.id("CardholderName"));
    public static final Target OPCION_MES = the("Opcion mes {0} de expiracion")
            .locatedBy("//option[text()='{0}']");
    public static final Target OPCION_ANNO_EXPIRACION = the("Opcion año {0} de expiracion")
            .located(By.id("ExpireYear"));
    public static final Target OPCION_ANNO= the("Opcion pais {0}")
            .locatedBy("//option[text()='{0}']");
    public static final Target CAMPO_CODIGO_TARJETA = the("Campo codigo tarjeta")
            .located(By.id("CardCode"));
    public static final Target BOTON_CONTINUAR_TC = the("Boton continuar desde metodo pago")
            .locatedBy("#payment-info-buttons-container input[type='button']");
    public static final Target BOTON_CONFIRMAR = the("Boton confirmar compra")
            .locatedBy("#confirm-order-buttons-container input[type='button']");

    public static final Target CAMPO_CONFIRMACION = the("Mensaje confirmacion compra")
            .locatedBy("[class='section order-completed']>div>strong");








}
