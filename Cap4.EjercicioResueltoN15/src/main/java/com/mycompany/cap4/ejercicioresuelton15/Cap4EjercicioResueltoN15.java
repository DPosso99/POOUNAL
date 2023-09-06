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
        //Entradas del peso de las esferas, recordar que segun el ejercicio tres deben ser iguales y una diferente. 
            
    if ((pesoA == pesoB) && (pesoA == pesoC)) { 
        /*Aqui comparamos el peso de la esfera A con la B y C. 
         Si son iguales, la esfera D seria la diferente.*/
      System.out.println("La esfera D es la diferente ");
    } else {
      if ((pesoA == pesoB) && (pesoA == pesoD)) { 
        /*Aqui comparamos el peso de la esfera A con la B y D. 
          Si son iguales, la esfera C seria la diferente.*/ 
        System.out.println("La esfera C es la diferente ");
            if (pesoD > pesoA){
                System.out.println("la esfera D es la de mayor peso"); 
                /*para saber si es de mayor o 
                menor peso que las otras, basta compararla con el peso de cualquiera de las otras tres*/
            }
            else {
                System.out.println("La esfera D es la de menor peso ");
            } 
      } else if ((pesoA == pesoB) && (pesoA == pesoD)) { 
        /*Aqui comparamos el peso de la esfera A con la B y D. 
        Si son iguales, la esfera C seria la diferente.*/
        System.out.println("La esfera C es la diferente ");
            if (pesoC > pesoA){
                    System.out.println("la esfera C es la de mayor peso");
                    }
                    /*para saber si es de mayor o menor peso que las otras,
                     basta compararla con el peso de cualquiera de las otras tres*/
                    else {
                    System.out.println("La esfera C es la de menor peso ");
                    }
      } else if ((pesoA == pesoC) && (pesoA == pesoD)) { 
        /*Aqui comparamos el peso de la esfera A con la C y D. 
        Si son iguales, la esfera B seria la diferente.*/
        System.out.println("La esfera B es la diferente ");
             if (pesoB > pesoD){
                    System.out.println("la esfera B es la de mayor peso");
                    }
                     /*para saber si es de mayor o menor peso que las otras,
                      basta compararla con el peso de cualquiera de las otras tres*/
                    else {
                    System.out.println("La esfera B es la de menor peso ");
                    }
      } else { 
        System.out.println("La esfera A es la diferente " ); 
        /*Aqui usamos el condicional else y entraria en esta instacia
        si las anteriores condiciones no se cumplen por ende la esfera A seria la diferente.*/
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
        
