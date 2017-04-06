/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author SPQR14
 */
public class Floyd extends Thread{
    
    private int [][] matrizC;
    private static int [][] matrizZ;
    private JLabel negativo;
    private JLabel aislado;
    private JLabel mensaje;
    private JProgressBar barrita;
    
    public Floyd(int [][] C, int [][] Z, JLabel negativo, JLabel aislado, JLabel mensaje,JProgressBar barra){
        matrizC = C;
        matrizZ = Z;
        this.negativo = negativo;
        this.aislado = aislado;
        this.mensaje = mensaje;
        this.barrita = barra;
    }
    
    public Floyd(int [][] C, int [][] Z){
        matrizC = C;
        matrizZ = Z;
    }
    
    private void inicializarMatrizZ(){
        for(int i = 0; i < matrizZ.length; i++){
            for(int j = 0; j < matrizZ[i].length; j++){
                matrizZ[i][j] = i + 1;
            }
        }
    }
    
    /************************************************************************************************************************
    ********************************************** LA PANASEA ***************************************************************
    **************************************** EL MOMENTO DE APOTEÓSIS ********************************************************
    ************************************************************************************************************************/
    
    private void calcularRutas(){
        int i;
        int j;
        int k = 0;
        inicializarMatrizZ();
        while(k < matrizC.length){
            for(i = 0; i < matrizC.length; i++){
                for(j = 0; j < matrizC[i].length; j++){
                    if(matrizC[i][j] < 0){
                        negativo.setText("¡Se encontraron circuitos negativos!");
                        System.out.println("¡Se encontraron circuitos negativos!");
                    }
                    if(matrizC[i][k] + matrizC[k][j] < matrizC[i][j]){
                        matrizC[i][j] = matrizC[i][k] + matrizC[k][j];
                        matrizZ[i][j] = k + 1;
                    }
                    if(matrizC[i][j] == 999){
                        String a = String.valueOf(i + 1);
                        aislado.setText("¡Se encontró que el nodo "+a+" es un nodo aislado!");
                        System.out.println("¡Se encontró que el nodo "+a+" es un nodo aislado!");
                    }
                    /*System.out.println("");
                    System.out.println("Matriz C:");
                    imprimirMatrizEnConsola(matrizC);
                    System.out.println("");
                    System.out.println("Matriz Z:");
                    imprimirMatrizEnConsola(matrizZ);*/
                }
            }
            barrita.setValue(k+1);
            barrita.repaint();
            k++;
        }
        mensaje.setText("¡Listo!");
        System.out.println("¡Listo!\n");
    }
    
    private void imprimirMatrizEnConsola(int [][] m){
        System.out.println("");
        for (int[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                System.out.printf("%4d", m1[j]);
            }
            System.out.println("");
        }
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public int[][] getMatrizZ() {
        return matrizZ;
    }
    
    @Override
    public void run(){
        calcularRutas();
    }
    
}
