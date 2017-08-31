/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pats.pkg17.pkg8.ecuacionsegundogrado;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class PATS178EcuacionSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double a, b, c, x, descriminante, cuadrado, multi;
        
        System.out.print("Ingresa el valor de a: ");
        a = teclado.nextDouble();
        
        System.out.print("Ingresa el valor de b: ");
        b = teclado.nextDouble();
        
        System.out.print("Ingresa el valor de c: ");
        c = teclado.nextDouble();
        
        //descriminante = Math.sqrt((Math.pow(b,2))-(4(a*c)));
        cuadrado = Math.pow(b, 2);
        multi = cuadrado-(4*(a*c));
        descriminante = Math.sqrt(multi);
        x = (-b + descriminante)/(2*a);
        //System.out.println(cuadrado);
        System.out.println("Numero a sacar la raiz" + multi);
        System.out.println(descriminante);
        System.out.println("X = " + x);
        
        
        
        
        
    }
    
}
