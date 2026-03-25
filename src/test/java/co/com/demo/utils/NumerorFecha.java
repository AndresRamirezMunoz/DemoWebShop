package co.com.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NumerorFecha {

    public static String numeroParaCorreo(){
        return new SimpleDateFormat("ssmmHHdd").format(new Date());
    }

}
