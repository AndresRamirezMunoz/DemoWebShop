package co.com.demo.models;

public class DatosEnvio {

    private final String COMPANIA;
    private final String PAIS;
    private final String CIUDAD;
    private final String DIRECCION;
    private final String CODIGO_POSTAL;
    private final String TELEFONO;

    public DatosEnvio(String compania, String pais, String ciudad, String direccion, String codigoPostal, String telefono) {
        COMPANIA = compania;
        PAIS = pais;
        CIUDAD = ciudad;
        DIRECCION = direccion;
        CODIGO_POSTAL = codigoPostal;
        TELEFONO = telefono;
    }

    public String getCOMPANIA() {
        return COMPANIA;
    }

    public String getPAIS() {
        return PAIS;
    }

    public String getCIUDAD() {
        return CIUDAD;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public String getCODIGO_POSTAL() {
        return CODIGO_POSTAL;
    }
    public String getTELEFONO() {
        return TELEFONO;
    }
}
