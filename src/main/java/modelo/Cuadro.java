
package modelo;

import java.awt.Color;
import javax.swing.JPanel;


public class Cuadro extends JPanel {
   private int ancho;
   private int altura;
   private Color color;
   
   public Cuadro (int ancho,int altura,Color color){
   this.ancho=ancho;
   this.altura=altura;
   this.color=color;
   
   
   
   
   
   
   }
   private void init(){
   setSize(ancho,altura);
   setBackground(color);
   
   
   }
   
}
