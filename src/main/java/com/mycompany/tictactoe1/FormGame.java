/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe1;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author pjdiaz
 */
public class FormGame extends javax.swing.JFrame {

    public FormGame() {
        init();
    
    }
    
    public void init() {
        setUndecorated(true);// Eleminar barra de opciones de la intefaz
        initComponents();
        setResizable(false); //Para no redimencionar la pantalla 
        setLocationRelativeTo(null);//Centrar UI en el medio de la pantalla
        PanelFondo.requestFocus();
        setBackground(new Color (0,0,0,0));
        PanelFondo.setOpaque(false);
       Border bordeBoton= BorderFactory.createLineBorder(new Color (243,211,246),2);
       PanelBoton.setBorder(bordeBoton);
        

       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new modelo.PanelRedondeado();
        Titulo = new javax.swing.JLabel();
        lblCierre = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JTextField();
        Jugador2 = new javax.swing.JTextField();
        PanelBoton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelFondo.setBackground(new java.awt.Color(0, 0, 102));
        PanelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        PanelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelFondoMousePressed(evt);
            }
        });
        PanelFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PanelFondoKeyTyped(evt);
            }
        });
        PanelFondo.setLayout(null);

        Titulo.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(230, 251, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("TIK TAC TOE");
        Titulo.setAlignmentY(30.0F);
        Titulo.setAutoscrolls(true);
        PanelFondo.add(Titulo);
        Titulo.setBounds(20, 10, 382, 52);

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
        lblCierre.setBounds(420, 10, 21, 32);

        Jugador1.setEditable(false);
        Jugador1.setBackground(new java.awt.Color(214, 252, 249));
        Jugador1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Jugador1.setForeground(new java.awt.Color(101, 175, 245));
        Jugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jugador1.setText("JUGADOR1");
        Jugador1.setBorder(null);
        Jugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Jugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jugador1FocusLost(evt);
            }
        });
        Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jugador1MouseExited(evt);
            }
        });
        Jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugador1ActionPerformed(evt);
            }
        });
        Jugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jugador1KeyTyped(evt);
            }
        });
        PanelFondo.add(Jugador1);
        Jugador1.setBounds(100, 140, 230, 40);

        Jugador2.setEditable(false);
        Jugador2.setBackground(new java.awt.Color(249, 230, 254));
        Jugador2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Jugador2.setForeground(new java.awt.Color(201, 105, 220));
        Jugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jugador2.setText("JUGADOR2");
        Jugador2.setBorder(null);
        Jugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Jugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jugador2FocusLost(evt);
            }
        });
        Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jugador2MouseExited(evt);
            }
        });
        Jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugador2ActionPerformed(evt);
            }
        });
        PanelFondo.add(Jugador2);
        Jugador2.setBounds(100, 230, 230, 40);

        PanelBoton.setBackground(new java.awt.Color(42, 22, 79));

        jLabel1.setBackground(new java.awt.Color(241, 227, 252));
        jLabel1.setFont(new java.awt.Font("KufiStandardGK", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelFondo.add(PanelBoton);
        PanelBoton.setBounds(140, 300, 160, 50);

        imagen1.setText("imagen1");
        imagen1.setRuta("/Recursos1/Circulo.png");
        PanelFondo.add(imagen1);
        imagen1.setBounds(360, 230, 49, 50);

        imagen2.setText("imagen1");
        imagen2.setRuta("/Recursos1/JugadorEquis.png");
        PanelFondo.add(imagen2);
        imagen2.setBounds(30, 130, 49, 50);

        imagen3.setText("imagen1");
        imagen3.setRuta("/Recursos1/JugadorCirculo.png");
        PanelFondo.add(imagen3);
        imagen3.setBounds(30, 230, 49, 50);

        imagen4.setText("imagen1");
        imagen4.setRuta("/Recursos1/Equis.png");
        PanelFondo.add(imagen4);
        imagen4.setBounds(360, 140, 49, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelFondoKeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(Jugador2.getText().length()>=8)
        evt.consume();
    }//GEN-LAST:event_PanelFondoKeyTyped

    private void PanelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelFondoMousePressed
        PanelFondo.requestFocus();
    }//GEN-LAST:event_PanelFondoMousePressed

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        PanelBoton.setBackground (new Color(42,22,79));//Cambio de color cuando el mouse esta fuera el Boton de Inicio
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        PanelBoton.setBackground (new Color(126,46,196));//Cambio de color cuando el mouse esta sobre el Boton de Inicio
    }//GEN-LAST:event_jLabel1MouseEntered

    private void Jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugador2ActionPerformed

    }//GEN-LAST:event_Jugador2ActionPerformed

    private void Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugador2MouseExited
        Jugador2.setBorder(null);
    }//GEN-LAST:event_Jugador2MouseExited

    private void Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugador2MouseEntered
        Border border = BorderFactory.createLineBorder(new Color(165, 40, 174), 2);
        Jugador2.setBorder(border);//Cambio de color cuando el mouse esta sobre el jugador 2
    }//GEN-LAST:event_Jugador2MouseEntered

    private void Jugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jugador2FocusLost
        if (Jugador2.getText().equals(""))
        Jugador2.setText("JUGADOR2");//Volver a Poner "Jugador2" su el usuario no completa la casilla
    }//GEN-LAST:event_Jugador2FocusLost

    private void Jugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jugador2FocusGained
        if (Jugador2.getText().equals("JUGADOR2"))//Eliminar texto para que el usuario pueda copletar nombre al dar clic en Jugador2
        Jugador2.setText("");
    }//GEN-LAST:event_Jugador2FocusGained

    private void Jugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(Jugador1.getText().length()>=8)
        evt.consume();

    }//GEN-LAST:event_Jugador1KeyTyped

    private void Jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugador1ActionPerformed

    }//GEN-LAST:event_Jugador1ActionPerformed

    private void Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugador1MouseExited
        Jugador1.setBorder(null);
    }//GEN-LAST:event_Jugador1MouseExited

    private void Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugador1MouseEntered
        Border border = BorderFactory.createLineBorder(new Color(52, 136, 235), 2);
        Jugador1.setBorder(border);//Cambio de color cuando el mouse esta sobre el jugador 1
    }//GEN-LAST:event_Jugador1MouseEntered

    private void Jugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jugador1FocusLost
        if (Jugador1.getText().equals("")) {
            Jugador1.setText("JUGADOR1");//Volver a Poner "Jugador1" su el usuario no completa la casilla
        }
    }//GEN-LAST:event_Jugador1FocusLost

    private void Jugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jugador1FocusGained
        if (Jugador1.getText().equals("JUGADOR1"))//Eliminar texto para que el usuario pueda copletar nombre al dar clic en Jugador1
        Jugador1.setText("");//Volver a Poner "Jugador1" su el usuario no completa la casilla
    }//GEN-LAST:event_Jugador1FocusGained

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(255, 153, 153)); //Cambio de color cuando el mouse  no esta sobre la X
    }//GEN-LAST:event_lblCierreMouseExited

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED); //Cambio de color cuando el mouse esta sobre la X
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
this.dispose();

Form_Tictactoe ticTactoe = new Form_Tictactoe();
ticTactoe.setVisible(true);
    }//GEN-LAST:event_jLabel1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jugador1;
    private javax.swing.JTextField Jugador2;
    private javax.swing.JPanel PanelBoton;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JLabel Titulo;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    // End of variables declaration//GEN-END:variables

    private void color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 }
