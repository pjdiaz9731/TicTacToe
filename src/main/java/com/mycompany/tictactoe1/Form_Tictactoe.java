/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe1;

import java.awt.Color;
import java.util.Locale;
import modelo.Jugador;
import modelo.Tablero;




public class Form_Tictactoe extends javax.swing.JFrame {

    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;

    public Form_Tictactoe(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;

        init();
    }

    public void init() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        lblJugador1.setText(jugador1.getNombre());
        lblJugador2.setText(jugador2.getNombre());

        tablero = new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador2(jugador2);
        tablero.setAlturaCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(new Color(239, 180, 255));
        tablero.setColorTablero(new Color(239, 180, 255));
        tablero.setLocation(40, 150);
        tablero.crearTablero();
        tablero.setVisible(true);
        PanelFondo.add(tablero);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        lblJugador2 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(14, 19, 43));
        PanelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        PanelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(255, 153, 153));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        PanelFondo.add(lblCierre);
        lblCierre.setBounds(370, 0, 21, 32);

        imagen1.setText("imagen1");
        imagen1.setRuta("/Recursos1/JugadorCirculo.png");
        PanelFondo.add(imagen1);
        imagen1.setBounds(275, 50, 50, 50);

        imagen3.setText("imagen1");
        imagen3.setRuta("/Recursos1/JugadorEquis.png");
        PanelFondo.add(imagen3);
        imagen3.setBounds(75, 50, 50, 50);

        lblJugador2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(255, 200, 255));
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador2.setText("NAME");
        PanelFondo.add(lblJugador2);
        lblJugador2.setBounds(255, 100, 90, 30);

        lblJugador1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(180, 232, 255));
        lblJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador1.setText("NAME");
        PanelFondo.add(lblJugador1);
        lblJugador1.setBounds(55, 100, 90, 30);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        PanelFondo.add(jLabel1);
        jLabel1.setBounds(190, 60, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        PanelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 60, 60, 60);

        lblPuntajeJ2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        PanelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 60, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED); //Cambio de color cuando el mouse esta sobre la X
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(255, 153, 153)); //Cambio de color cuando el mouse  no esta sobre la X
    }//GEN-LAST:event_lblCierreMouseExited

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    // End of variables declaration//GEN-END:variables
}
