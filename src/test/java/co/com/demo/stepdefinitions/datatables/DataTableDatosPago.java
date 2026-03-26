package co.com.demo.stepdefinitions.datatables;

import co.com.demo.models.DatosEnvio;
import co.com.demo.models.DatosPago;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableDatosPago {

    @DataTableType
    public DatosPago datosPagoEntry(Map<String, String> entry) {
        return new DatosPago(
                entry.get("tipoTarjeta"),
                entry.get("nombreTarjeta"),
                entry.get("numeroTarjeta"),
                entry.get("mes"),
                entry.get("anno"),
                entry.get("coidgo")
        );
    }
}
