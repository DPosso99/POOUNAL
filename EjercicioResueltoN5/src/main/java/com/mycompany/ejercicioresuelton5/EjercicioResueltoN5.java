/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelton5;

/**
 *
 * @author David
 */
public class EjercicioResueltoN5 {

    public static void main(String[] args) {
        double suma ,x, y; //Se usa double para numeros muy grandes con muchas cifras decimales 
        suma = 0;
        x = 20;
        y = 40;
        suma = suma + x; 
        x = x + Math.pow(y , 2); // se uso la funcion Math.pow para la potenciacion  
        suma = suma + (x/y);
        
        System.out.println("El valor de la suma es: " + suma);
    }
}
