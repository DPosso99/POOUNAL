/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap4.ejercicioresuelton15;

/**
 *
 * @author David
 */
import java.util.Scanner;
        
public class Cap4EjercicioResueltoN15 {

    public static void main(String[] args) {
        double pesoA, pesoB, pesoC, pesoD;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el peso de la esfera A: ");
        pesoA = entrada.nextDouble();
        
        System.out.println("digite el peso de la esfera B: ");
        pesoB = entrada.nextDouble();
        
        System.out.println("digite el peso de la esfera C: ");
        pesoC = entrada.nextDouble();
        
        System.out.println("digite el peso de la esfera D: ");
        pesoD = entrada.nextDouble();
// Realizamos Cálculos y mostramos en pantalla
    if ((pesoA == pesoB) && (pesoA == pesoC)) {
      System.out.println("La esfera D es la diferente ");
    } else {
      if ((pesoA == pesoB) && (pesoA == pesoD)) {
        System.out.println("La esfera C es la diferente ");
            if (pesoD > pesoA){
                System.out.println("la esfera D es la de mayor peso");
            }
            else {
                System.out.println("La esfera D es la de menor peso ");
            } 
      } else if ((pesoA == pesoB) && (pesoA == pesoD)) {
        System.out.println("La esfera C es la diferente ");
            if (pesoC > pesoA){
                    System.out.println("la esfera C es la de mayor peso");
                    }
                    else {
                    System.out.println("La esfera C es la de menor peso ");
                    }
      } else if ((pesoA == pesoC) && (pesoA == pesoD)) {
        System.out.println("La esfera B es la diferente ");
             if (pesoB > pesoD){
                    System.out.println("la esfera B es la de mayor peso");
                    }
                    else {
                    System.out.println("La esfera B es la de menor peso ");
                    }
      } else {
        System.out.println("La esfera A es la diferente " );
            if (pesoA > pesoB){
                    System.out.println("la esfera A es la de mayor peso");
                    }
                    else {
                    System.out.println("La esfera A es la de menor peso ");
                    }
        }
    }
  }
}
        
