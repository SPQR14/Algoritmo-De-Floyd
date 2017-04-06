/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import algoritmo.*;

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
        if(System.getProperty("os.arch").toUpperCase().equals("AMD64")){
            etiquetaOrden.setText("Ok!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonArrancar = new javax.swing.JButton();
        jTextFieldEntradaNumeroNodos = new javax.swing.JTextField();
        Etiqueta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizDeDistancias = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCircuitos = new javax.swing.JLabel();
        jLabelAislado = new javax.swing.JLabel();
        jBarra = new javax.swing.JProgressBar(0, nodos * 10);
        jLabelMensajeListo = new javax.swing.JLabel();
        etiquetaSO = new javax.swing.JLabel();
        etiquetaArquitectura = new javax.swing.JLabel();
        etiquetaVersion = new javax.swing.JLabel();
        etiquetaOrden = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelSO = new javax.swing.JLabel();
        jLabelArch = new javax.swing.JLabel();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("Matriz C");

        jLabel3.setText("Matriz Z");

        etiquetaSO.setText("jLabel4");

        etiquetaArquitectura.setText("jLabel4");

        etiquetaVersion.setText("jLabel4");

        etiquetaOrden.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        etiquetaOrden.setText("jLabel4");

        jLabelVersion.setText("Versión:");

        jLabelSO.setText("SO:");

        jLabelArch.setText("Arquitectura:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldEntradaNumeroNodos))
                        .addGap(17, 17, 17)
                        .addComponent(jButtonArrancar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelAislado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCircuitos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(234, 234, 234)
                                        .addComponent(jLabelMensajeListo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelSO)
                                    .addComponent(jLabelArch))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etiquetaSO, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(etiquetaArquitectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelVersion)
                                        .addGap(25, 25, 25)
                                        .addComponent(etiquetaVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(etiquetaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Etiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMensajeListo)
                            .addComponent(jBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonArrancar)
                                .addComponent(jTextFieldEntradaNumeroNodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSO)
                    .addComponent(etiquetaVersion)
                    .addComponent(jLabelVersion)
                    .addComponent(jLabelSO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaArquitectura)
                            .addComponent(jLabelArch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCircuitos))
                    .addComponent(etiquetaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAislado))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonArrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArrancarActionPerformed
        Floyd floyd;
        floyd = new Floyd(matrizC, matrizZ,jLabelAislado,jLabelCircuitos,jLabelMensajeListo,jBarra );
        floyd.start();
        matrizC = floyd.getMatrizC();
        matrizZ = floyd.getMatrizZ();
    }//GEN-LAST:event_jButtonArrancarActionPerformed

    private void jTextFieldEntradaNumeroNodosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntradaNumeroNodosKeyPressed
        
    }//GEN-LAST:event_jTextFieldEntradaNumeroNodosKeyPressed

    private void jTextFieldEntradaNumeroNodosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntradaNumeroNodosKeyTyped

    }//GEN-LAST:event_jTextFieldEntradaNumeroNodosKeyTyped

    private void jTextFieldEntradaNumeroNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaNumeroNodosActionPerformed
        // TODO add your handling code here:
        String N = jTextFieldEntradaNumeroNodos.getText();
        nodos = Integer.parseInt(N);
        if(nodos < 0 || nodos > 10){
            new Advertencia().setVisible(true);
        }
        //nodos = Integer.parseInt(N);
        matrizC = new int [nodos][nodos];
        matrizZ = new int [nodos][nodos];
    }//GEN-LAST:event_jTextFieldEntradaNumeroNodosActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta;
    private static javax.swing.JLabel etiquetaArquitectura;
    private javax.swing.JLabel etiquetaOrden;
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
    private javax.swing.JLabel jLabelSO;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEntradaNumeroNodos;
    private javax.swing.JTable matrizDeDistancias;
    // End of variables declaration//GEN-END:variables
}
