package co.com.demo.stepdefinitions;


import co.com.demo.models.DatosPersonales;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableDatosPersonales {

    @DataTableType
    public DatosPersonales datosPersonalesEntry(Map<String, String> entry) {
        return new DatosPersonales(
                entry.get("nombre"),
                entry.get("apellido"),
                entry.get("genero"),
                entry.get("email"),
                entry.get("contrasena")
        );
    }
}