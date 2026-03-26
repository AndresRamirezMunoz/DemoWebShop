package co.com.demo.stepdefinitions.datatables;


import co.com.demo.models.DatosEnvio;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableDatosEnvio {

    @DataTableType
    public DatosEnvio datosEnvioEntry(Map<String, String> entry) {
        return new DatosEnvio(
                entry.get("compania"),
                entry.get("pais"),
                entry.get("ciudad"),
                entry.get("direccion"),
                entry.get("codigoPostal"),
                entry.get("telefono")
        );
    }
}