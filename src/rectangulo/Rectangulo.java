/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;



/**
 *
 * @author SEBASTIAN
 */
public class Rectangulo {
   private int ancho,alto;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int area(){
        return alto*ancho;
    }
    
    public int perimetro(){
        return 2*(alto+ancho);
    }
    
}
