
package util;

import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spqr14
 */
public class Guardar {
    
    int [][] mC;
    int [][] mZ;
    int n;
    int i;
    int j;
    
    public Guardar(int [][] C, int [][] Z, int n){
        this.mC = C;
        this.mZ = Z;
        this.n = n;
    }
    
    public void guardar(){
        //ArrayList<Filas> resultados = new ArrayList();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
        int x = 0; 
        int y = 0;
        String nombre = "lol";
        String ruta = "";
        switch (n){
            case 1:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray1();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 2:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray2();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 3:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray3();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 4:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray4();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 5:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                        if(y == 4){
                            e = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d,e));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray5();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 6:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                        if(y == 4){
                            e = mC[x][y];
                        }
                        if(y == 5){
                            f = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d,e,f));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray6();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 7:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                        if(y == 4){
                            e = mC[x][y];
                        }
                        if(y == 5){
                            f = mC[x][y];
                        }
                        if(y == 6){
                            g = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d,e,f,g));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray7();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 8:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                        if(y == 4){
                            e = mC[x][y];
                        }
                        if(y == 5){
                            f = mC[x][y];
                        }
                        if(y == 6){
                            g = mC[x][y];
                        }
                        if(y == 7){
                            h = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d,e,f,g,h));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray8();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 9:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(y = 0; y < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                        if(y == 4){
                            e = mC[x][y];
                        }
                        if(y == 5){
                            f = mC[x][y];
                        }
                        if(y == 6){
                            g = mC[x][y];
                        }
                        if(y == 7){
                            h = mC[x][y];
                        }
                        if(y == 8){
                            i = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d,e,f,g,h, i));   
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray9();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            case 10:{
                ArrayList<Filas> resultados = new ArrayList();
                for(x = 0; x < mC.length; x++){
                    for(x = 0; x < mC[x].length; y++){
                        if(y == 0){
                            a = mC[x][y];
                        }
                        if(y == 1){
                            b = mC[x][y];
                        }
                        if(y == 2){
                            c = mC[x][y];
                        }
                        if(y == 3){
                            d = mC[x][y];
                        }
                        if(y == 4){
                            e = mC[x][y];
                        }
                        if(y == 5){
                            f = mC[x][y];
                        }
                        if(y == 6){
                            g = mC[x][y];
                        }
                        if(y == 7){
                            h = mC[x][y];
                        }
                        if(y == 8){
                            i = mC[x][y];
                        }
                        if(y == 9){
                            j = mC[x][y];
                        }
                    }
                    resultados.add(new Filas(a,b,c,d,e,f,g,h,i,j));
                }
                /*Selección del nombre del archivo y la ruta*/
                /*temporalmente se nombrará nombre y ruta*/
                CsvWriter escritor = new CsvWriter(ruta + nombre + ".csv");
                resultados.forEach((Filas filas) -> {
                try {
                    String data[] = filas.getArray10();
                    escritor.writeRecord(data);
                } catch (IOException ex) {
                    Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
                }
                });
                escritor.close();
                break;
            }
            default: {
                System.out.println("No se pudo crear el archivo debido a un error desconocido.");
            }    
        }
    }
        
}
