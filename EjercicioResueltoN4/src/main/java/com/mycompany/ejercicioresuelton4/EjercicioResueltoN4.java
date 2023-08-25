/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelton4;

/**
 *
 * @author David
 */
public class EjercicioResueltoN4 {

    public static void main(String[] args) {
        int edalbert, edana, edmama, edjuan=9; //Edad de Juan
        edalbert = 2* (edjuan/3); //Edad de Alberto 
        edana = 4* (edjuan/3); //Edad de Ana 
        edmama = edalbert + edjuan + edana;//Edad de la Madre 
    System.out.println("Juan tiene :" + edjuan + "años");
    System.out.println("Alberto tiene :" + edalbert + "años");
    System.out.println("Ana tiene :" + edana + "años");
    System.out.println("La madre tiene :" + edmama + "años");
    }
}
