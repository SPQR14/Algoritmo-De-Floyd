
package GUI;

import algoritmo.*;
import util.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author SPQR14
 */

public class FlyodGUI extends javax.swing.JFrame {

    /**
     * Creates new form FlyodGUI
     */
    
    private int [][] matrizC;
    private int [][] matrizZ;
    private int nodos;
    
    public FlyodGUI() {
        initComponents();
        etiquetaSO.setText(System.getProperty("os.name").toUpperCase());
        etiquetaArquitectura.setText(System.getProperty("os.arch").toUpperCase());
        etiquetaVersion.setText(System.getProperty("os.version").toUpperCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        canvas1 = new java.awt.Canvas();
        jLabel1 = new javax.swing.JLabel();
        jButtonArrancar = new javax.swing.JButton();
        jTextFieldEntradaNumeroNodos = new javax.swing.JTextField();
        Etiqueta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizDeDistancias = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMatrizDeRutas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCircuitos = new javax.swing.JLabel();
        jLabelAislado = new javax.swing.JLabel();
        jBarra = new javax.swing.JProgressBar(0, nodos + 1);
        jLabelMensajeListo = new javax.swing.JLabel();
        etiquetaSO = new javax.swing.JLabel();
        etiquetaArquitectura = new javax.swing.JLabel();
        etiquetaVersion = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelSO = new javax.swing.JLabel();
        jLabelArch = new javax.swing.JLabel();
        etiquetaInfinito = new javax.swing.JLabel();
        jLabelNegativo2 = new javax.swing.JLabel();
        jLabelNodoAislado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuGuardar = new javax.swing.JMenuItem();
        jMenuNuevo = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuAcercaDe = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ruta más corta entre todo par de nodos");
        setLocationByPlatform(true);
        setResizable(false);

        jButtonArrancar.setText("¡Iniciar!");
        jButtonArrancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArrancarActionPerformed(evt);
            }
        });

        jTextFieldEntradaNumeroNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaNumeroNodosActionPerformed(evt);
            }
        });
        jTextFieldEntradaNumeroNodos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEntradaNumeroNodosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEntradaNumeroNodosKeyTyped(evt);
            }
        });

        Etiqueta.setText("Número de nodos (máximo 10):");

        matrizDeDistancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(matrizDeDistancias);

        jMatrizDeRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jMatrizDeRutas);

        jLabel2.setText("Matriz C");

        jLabel3.setText("Matriz Z");

        etiquetaSO.setText("jLabel4");

        etiquetaArquitectura.setText("jLabel4");

        etiquetaVersion.setText("jLabel4");

        jLabelVersion.setText("Versión:");

        jLabelSO.setText("SO:");

        jLabelArch.setText("Arquitectura:");

        jMenu2.setText("Archivo");

        jMenuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuGuardar.setText("Guardar");
        jMenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuGuardar);

        jMenuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNuevo.setText("Nuevo");
        jMenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNuevo);

        jMenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuSalir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuAcercaDe.setText("Acerca De...");
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNodoAislado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelArch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaArquitectura, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNegativo2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaSO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVersion))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButtonArrancar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelAislado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCircuitos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaInfinito))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelMensajeListo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Etiqueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEntradaNumeroNodos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Etiqueta)
                    .addComponent(jTextFieldEntradaNumeroNodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMensajeListo)
                            .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonArrancar)
                                .addComponent(etiquetaInfinito)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVersion)
                    .addComponent(etiquetaSO)
                    .addComponent(jLabelSO)
                    .addComponent(jLabelNegativo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaArquitectura)
                    .addComponent(jLabelArch)
                    .addComponent(etiquetaVersion)
                    .addComponent(jLabelNodoAislado))
                .addGap(53, 53, 53)
                .addComponent(jLabelCircuitos)
                .addGap(18, 18, 18)
                .addComponent(jLabelAislado))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonArrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArrancarActionPerformed
        matrizC = this.leerMatrizC();
        Floyd floyd;
        floyd = new Floyd(matrizC, matrizZ,jLabelNegativo2,jLabelNodoAislado,jLabelMensajeListo,jBarra);
        floyd.ejecutar();
        floyd.start();
        this.mostrarMatrizZ(floyd.getMatrizZ());
        this.mostrarMatrizC(floyd.getMatrizC());
    }//GEN-LAST:event_jButtonArrancarActionPerformed

    private void jTextFieldEntradaNumeroNodosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntradaNumeroNodosKeyPressed
        
    }//GEN-LAST:event_jTextFieldEntradaNumeroNodosKeyPressed

    private void jTextFieldEntradaNumeroNodosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntradaNumeroNodosKeyTyped

    }//GEN-LAST:event_jTextFieldEntradaNumeroNodosKeyTyped

    private void jTextFieldEntradaNumeroNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaNumeroNodosActionPerformed
        nodos = Integer.parseInt(jTextFieldEntradaNumeroNodos.getText());
        Floyd floyd;
        if(nodos <= 0 || nodos > 10){
            new Advertencia().setVisible(true);
        }else{
            matrizC = new int [nodos][nodos];
            matrizZ = new int [nodos][nodos];
            floyd = new Floyd(matrizC, matrizZ);
            floyd.inicializarMatrizZ(matrizZ);
            matrizZ = floyd.getMatrizZ();
            this.mostrarMatrizZ(matrizZ);
            this.mostrarMatrizC(matrizC);
        }
    }//GEN-LAST:event_jTextFieldEntradaNumeroNodosActionPerformed

    private void jMenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarActionPerformed
        Guardar guarda = new Guardar(matrizC, matrizZ, nodos);
        guarda.start();
    }//GEN-LAST:event_jMenuGuardarActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaDeActionPerformed
        
    }//GEN-LAST:event_jMenuAcercaDeActionPerformed

    private void jMenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoActionPerformed
        jBarra.setValue(0);
        jLabelMensajeListo.setText("");
        jTextFieldEntradaNumeroNodos.setText("");
        jLabelAislado.setText("");
        jLabelNegativo2.setText("");
        jMatrizDeRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        matrizDeDistancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
    }//GEN-LAST:event_jMenuNuevoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlyodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlyodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlyodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlyodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FlyodGUI().setVisible(true);
        });        
    }
    
    private void mostrarMatrizZ(int [][] z){
        DefaultTableModel modeloZ;
        modeloZ = (DefaultTableModel) jMatrizDeRutas.getModel();
        modeloZ.setRowCount(nodos);
        modeloZ.setColumnCount(nodos);
        for(int i = 0; i < nodos; i++){
            for(int j = 0; j < nodos; j++){
                jMatrizDeRutas.setValueAt(matrizZ[i][j], i, j);
            }
        }
    }
    
    private void mostrarMatrizC(int [][] c){
        etiquetaInfinito.setText("999 para infinito.");
        DefaultTableModel modeloC;
        modeloC = (DefaultTableModel) matrizDeDistancias.getModel();
        modeloC.setRowCount(nodos);
        modeloC.setColumnCount(nodos);
        for(int i = 0; i < nodos; i++){
            for(int j = 0; j < nodos; j++){
                matrizDeDistancias.setValueAt(matrizC[i][j], i, j);
            }
        }
    }
    
    public int [][] leerMatrizC(){
        String dato;
        DefaultTableModel modeloC;
        modeloC = (DefaultTableModel) matrizDeDistancias.getModel();
        for(int i = 0; i < nodos; i++){
            for(int j = 0; j < nodos; j++){
                dato = String.valueOf(modeloC.getValueAt(i, j));
                matrizC[i][j] = Integer.parseInt(dato);
            }
        }
        return matrizC;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta;
    private java.awt.Canvas canvas1;
    private static javax.swing.JLabel etiquetaArquitectura;
    private javax.swing.JLabel etiquetaInfinito;
    private static javax.swing.JLabel etiquetaSO;
    private javax.swing.JLabel etiquetaVersion;
    public javax.swing.JProgressBar jBarra;
    private javax.swing.JButton jButtonArrancar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAislado;
    private javax.swing.JLabel jLabelArch;
    private javax.swing.JLabel jLabelCircuitos;
    private javax.swing.JLabel jLabelMensajeListo;
    private javax.swing.JLabel jLabelNegativo2;
    private javax.swing.JLabel jLabelNodoAislado;
    private javax.swing.JLabel jLabelSO;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JTable jMatrizDeRutas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAcercaDe;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGuardar;
    private javax.swing.JMenuItem jMenuNuevo;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldEntradaNumeroNodos;
    private javax.swing.JTable matrizDeDistancias;
    // End of variables declaration//GEN-END:variables
}
