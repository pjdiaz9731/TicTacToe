package modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Tablero extends JPanel {

    private int anchoCI;
    private int alturaCI;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    
    private Jugador jugador1;
    private Jugador jugador2;
     private ArrayList<Cuadro> cuadros;

    public Tablero() {
        init();
    }

    private void init() {
        anchoCI = 80;
        alturaCI = 80;
        colorCI = Color.BLUE;
        colorTablero = Color.RED;
        margen = 6;
        jugador1 = new Jugador();
        jugador2 = new Jugador();
        cuadros =  new ArrayList();

    }

    public void crearTablero() {
        setLayout(null);
        setSize(anchoCI * 3 + margen * 4, alturaCI * 3 + margen * 4);
        setBackground(colorTablero);
        crearCuadrosInternos();

    }

    private void crearCuadrosInternos() {
        int x = margen;
        int y = margen;
        for (int i = 0; i < 3; i++) {
        x=margen;
            for (int j = 0; j < 3; j++) {
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, colorCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x, y);
                add(cuadro);
            x+=(anchoCI+margen);
            }
        y+=(alturaCI+margen);
        }
    }

    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

}
