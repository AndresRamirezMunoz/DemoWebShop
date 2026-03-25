package co.com.demo.models;

import co.com.demo.utils.NumerorFecha;

public class DatosPersonales {
    private final String NOMBRE;
    private final String APELLIDO;
    private final String GENERO;
    private final String CORREO;
    private final String CONTRASENA;


    public DatosPersonales(String nombre, String apellido, String genero, String correo, String contrasena) {
        this.NOMBRE = nombre;
        this.APELLIDO = apellido;
        this.GENERO = genero;
        this.CORREO = correo;
        this.CONTRASENA = contrasena;

    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public String getGENERO() {
        if (GENERO.equals("Masculino"))
            return "female";
        return "male";
    }

    public String getCORREO() {
        return NumerorFecha.numeroParaCorreo() + CORREO;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

}
