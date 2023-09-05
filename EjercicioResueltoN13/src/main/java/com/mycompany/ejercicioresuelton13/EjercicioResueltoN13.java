/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelton13;

/**
 *
 * @author David
 */
import  java.util.Scanner;
        
public class EjercicioResueltoN13 {

    public static void main(String[] args) {
        double vlrcompra, descuento;
        String color;
        
        Scanner entrada = new Scanner (System.in);    
        System.out.println("¿Cual fue el valor total de su compra?: $ ");
        vlrcompra = entrada.nextDouble();
        
        System.out.print ("¿Que color tiene la bola que saco?: ");
        color = entrada.next();
        
    if (color.equals("blanca")) {
      descuento = vlrcompra;
    } else {
      if (color.equals("verde")) {
        descuento = (vlrcompra * (0.1));
      } else if (color.equals("amarilla")) {
        descuento = (vlrcompra * (0.25));
      } else if (color.equals("azul")) {
        descuento = (vlrcompra * (0.5));
      } else {
        descuento = (vlrcompra * 0);
      }
    }
    System.out.println("El cliente debe pagar: $ " + descuento );
  }
}
