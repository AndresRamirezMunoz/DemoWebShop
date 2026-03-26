package co.com.demo.models;

public class DatosPago {


    private final String TIPO_TARJETA;
    private final String NOMBRE_TARJETA;
    private final String NUMERO_TARJETA;
    private final String MES;
    private final String ANNO;
    private final String CODIGO;

    public DatosPago(String tipoTarjeta, String nombreTarjeta, String numeroTarjeta, String mes, String anno, String codigo) {
        TIPO_TARJETA = tipoTarjeta;
        NOMBRE_TARJETA = nombreTarjeta;
        NUMERO_TARJETA = numeroTarjeta;
        MES = mes;
        ANNO = anno;
        CODIGO = codigo;
    }

    public String getTIPO_TARJETA() {
        return TIPO_TARJETA;
    }

    public String getNOMBRE_TARJETA() {
        return NOMBRE_TARJETA;
    }

    public String getNUMERO_TARJETA() {
        return NUMERO_TARJETA;
    }

    public String getMES() {
        return MES;
    }

    public String getANNO() {
        return ANNO;
    }

    public String getCODIGO() {
        return CODIGO;
    }
}
