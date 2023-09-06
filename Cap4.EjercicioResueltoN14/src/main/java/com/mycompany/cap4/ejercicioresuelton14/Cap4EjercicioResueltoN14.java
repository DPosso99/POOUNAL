/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cap4.ejercicioresuelton14;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Cap4EjercicioResueltoN14 {

    public static void main(String[] args) {
        double ventasd1, ventasd2, ventasd3, salario, porventas, tventas;
        double salv1, salv2, salv3;
        //definimos el tipo variables que vamos a usar 
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingerese las ventas del departamento 1");// pedimos que ingresen los datos de las ventas de cada departamento. 
        ventasd1 = entrada.nextDouble(); 
        
        System.out.println("ingrese las ventas del departamento 2");
        ventasd2 = entrada.nextDouble();
        
        System.out.println("ingrese las ventas del departamento 3");
        ventasd3 = entrada.nextDouble();
        
        System.out.println("ingrese el salario base de los vendedores");
        salario = entrada.nextDouble();
        
        tventas = (ventasd1 + ventasd2 + ventasd3); // Ventas totales de de la empresa    
        porventas = (0.3*tventas); /**Calculamos el porcentaje de ventas cuando los departamentos excedan el 33% de las ventas totales*/
        
        if(ventasd1 > porventas){ 
            /**condicional donde comprabamos si las ventas del departamento 1 son mayores a el 33% de las ventas totales*/
            salv1 = (salario + (0.2*salario)); //calculo del salario si cumplen la condicion anterio. 
        }
        else {
             salv1 = salario; //si no la cumple, se le da el salario base.  
        }
        
        if (ventasd2 > porventas){
            salv2 = (salario + (0.2*salario));
        }
        else {
            salv2 = salario;
        }
        
           if (ventasd3 > porventas){
            salv3 = (salario + (0.2*salario));
        }
        else {
            salv3 = salario;
        }
        
        System.out.println("Las ventas totales de la empresa fueron: $ " + tventas);
        System.out.println("El salario de los vendedores del departamento 1 es: $ " + salv1);
        System.out.println("El salario de los vendedores del departamento 2 es: $ " + salv2);
        System.out.println("El salario de los vendedores del departamento 3 es: $ " + salv3);
    }
}

