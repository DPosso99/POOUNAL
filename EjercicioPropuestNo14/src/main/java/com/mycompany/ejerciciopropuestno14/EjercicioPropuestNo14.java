/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropuestno14;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EjercicioPropuestNo14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero"); //Input del numero
        float Num = entrada.nextFloat();//
        double Num_cuad = Math.pow(Num , 2);  
        double Num_cub = Math.pow(Num , 3);
        /*En este caso use la funcion Math.pow*/
        System.out.println("El numero ingresado es: " + Num);
        System.out.println("El cuadrado del numero es: " + Num_cuad);
        System.out.println("El cubo del numero es :" + Num_cub);
    }
}
