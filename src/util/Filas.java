
package util;

/**
 *
 * @author SPQR14
 */
public class Filas {
    
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    
    public Filas(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public String[] getArray(){
        String datos[] = {String.valueOf(a), String.valueOf(b), String.valueOf(c), String.valueOf(d), String.valueOf(e), String.valueOf(f), String.valueOf(g),
            String.valueOf(h), String.valueOf(i), String.valueOf(j)};
        return datos;
    }
    
}
