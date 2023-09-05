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
        //declaramos el tipo de variables que vamos a usar 
        Scanner entrada = new Scanner (System.in);    
        System.out.println("¿Cual fue el valor total de su compra?: $ ");
        vlrcompra = entrada.nextDouble();
        //Entradas para que ingresen el valor total de compra y que color de bolita saco, para calcular el respectivo descuento. 
        System.out.print ("¿Que color tiene la bola que saco?: ");
        color = entrada.next();
        
    if (color.equals("blanca")) { //comparamos el color de bola que el cliente saco, para comparar strings usamos .equals
      descuento = vlrcompra; // Si el cliente saca una bolita blanca, el descuento es del 0% sobre el valor total de su compra. 
    } else { //si la primera condicion no se cumple entramos en esta nueva condicion. 
      if (color.equals("verde")) {
        descuento = (vlrcompra * (0.1));// Si el cliente saca una bolita verde, el descuento es del 10% sobre el valor total de su compra. 
      } else if (color.equals("amarilla")) { 
        descuento = (vlrcompra * (0.25)); // Si el cliente saca una bolita amarilla, el descuento es del 25% sobre el valor total de su compra. 
      } else if (color.equals("azul")) {
        descuento = (vlrcompra * (0.5)); // Si el cliente saca una bolita azul, el descuento es del 50% sobre el valor total de su compra. 
      } else {
        descuento = (vlrcompra * 0); // Si el cliente saca una bolita roja, el descuento es del 100% sobre el valor total de su compra. 
      }
    }
    System.out.println("El cliente debe pagar: $ " + descuento ); //Valor del pago total que debeb hacer el cliente
  }
}
