/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto4;

import java.util.Scanner;

public class EjercicioResuelto4 {

    public static void main(String[] args) {
        int edalbert, edana, edmama, edjuan; //edad de juan
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan");
        edjuan = entrada.nextInt();//Edad de Juan ingresada por el usuario
        edalbert = 2* (edjuan/3); //Edad de alberto 
        edana = 4* (edjuan/3); //Edad de ana 
        edmama = edalbert + edjuan + edana;//edad de madre 
    System.out.println("Juan tiene :" + edjuan);
    System.out.println("Aleberto tiene :" + edalbert);
    System.out.println("Ana tiene :" + edana);
    System.out.println("La madre tiene :" + edmama);
    }
}
