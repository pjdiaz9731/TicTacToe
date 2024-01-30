package modelo;

import com.mycompany.tictactoe1.TipoImagen;

public class Ruta {

    public static final String EQUIS = "/Recursor1/Equis.png";
    public static final String CIRCULO = "/Recursor1/Circulo.png";
    public static final String JUGADOREQUISM = "/Recursos1/ JugadorEquis.jpg";

    public static String LINEA1 = "/Recursos1/CirculoLinea1.png";
    public static String LINEA2 = "/Recursos1/CirculoLinea2.png";
    public static String LINEA3 = "/Recursos1/CirculoLinea3.png";
    public static String LINEA4 = "/Recursos1/CirculoLinea4.png";
    public static String LINEA5 = "/Recursos1/CirculoLinea5.png";
    public static String LINEA6 = "/Recursos1/CirculoLinea6.png";
    public static String LINEA7 = "/Recursos1/CirculoLinea7.png";
    public static String LINEA8 = "/Recursos1/CirculoLinea8.png";

    public static void cambiarrutas(TipoImagen tipoiImagen) {
        if (tipoImagen == TipoImagen.Circulo) {
            LINEA1 = "/Recursos1/CirculoLinea1.png";
            LINEA2 = "/Recursos1/CirculoLinea2.png";
            LINEA3 = "/Recursos1/CirculoLinea3.png";
            LINEA4 = "/Recursos1/CirculoLinea4.png";
            LINEA5 = "/Recursos1/CirculoLinea5.png";
            LINEA6 = "/Recursos1/CirculoLinea6.png";
            LINEA7 = "/Recursos1/CirculoLinea7.png";
            LINEA8 = "/Recursos1/CirculoLinea8.png";

        }

    }

}
