/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropueston12;

/**
 *
 * @author David
 */
public class EjercicioPropuestoN12 {

    public static void main(String[] args) {
        int horas = 48; //horas que el empleado trabaja a la semana.
        float sueldo, reten;
        sueldo = 5000; // $ que gana a razon de cada hora. 
        reten = (float) 0.125; //porcentaje de retención en la fuente 12.5/100
        float sal_bruto = horas * sueldo;// Salario bruto
        float ret_fuente = sal_bruto * reten; // Retencion de la fuente
        float sal_neto = sal_bruto - ret_fuente; // Salario Neto
        
        System.out.println("El salario bruto del trabajador es: " + sal_bruto);
        System.out.println("La retención en la fuente del trabajador es: " + ret_fuente);
        System.out.println("El salario neto del trabajador es: " + sal_neto);
    }
}
