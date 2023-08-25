/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropuestono17;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EjercicioPropuestoNo17 {

    public static void main(String[] args) {
        float Pi = (float) 3.14159265359;// Damos valor de PI aproximado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo"); //Input del radio del circulo
        float rad = entrada.nextFloat();
        
        System.out.println("El area del circulo es: " + (Math.pow(rad,2))*Pi);// Culculamos el area del circulo como Pi*r**2
        System.out.println("La longitud de la circunferencia es : " + (Pi*2) * rad );
         /*La longitud de la circunferencia es igual a: 
         2*PI*radio */
    }
}
