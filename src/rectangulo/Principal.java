/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class Principal {
    
      public static void main(String[] args) {
        int a,b,are,per;
        Rectangulo r1=new Rectangulo();
        // TODO code application logic here
        System.out.print("Ancho: ");
        Scanner lector=new Scanner(System.in);
        a =lector.nextInt();
        
        System.out.print("Alto: ");
        b =lector.nextInt();
        
        r1.setAncho(a);
        r1.setAlto(b);
              
        System.out.println("Area: "+r1.area()+" Perimetro: "+r1.perimetro());
        
    }
    
}
