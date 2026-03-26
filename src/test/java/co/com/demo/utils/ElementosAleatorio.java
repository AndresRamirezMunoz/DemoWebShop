package co.com.demo.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;
import net.serenitybdd.screenplay.Actor;

import static co.com.demo.userinterfaces.PaginaProductos.PRODUCTOS;

public class ElementosAleatorio {

    public static  <T extends Actor> WebElementFacade productoAleatorio(T actor){
        List<WebElementFacade> productos = PRODUCTOS.resolveAllFor(actor);
        int random = new Random().nextInt(productos.size());
        return  productos.get(random);
    }
}
