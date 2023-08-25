/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto4;

import java.util.Scanner;

public class EjercicioResuelto4 {

    public static void main(String[] args) {
        int edalbert, edana, edmama, edjuan; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan");
        edjuan = entrada.nextInt();//Edad de Juan ingresada por el usuario
        edalbert = 2* (edjuan/3); //Edad de Alberto 
        edana = 4* (edjuan/3); //Edad de Ana 
        edmama = edalbert + edjuan + edana;//Edad de la madre 
    System.out.println("Juan tiene :" + edjuan + "años"); 
    System.out.println("Aleberto tiene :" + edalbert + "años");
    System.out.println("Ana tiene :" + edana + "años");
    System.out.println("La madre tiene :" + edmama + "años");
    }
}
