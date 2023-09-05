/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelton14;

/**
 *
 * @author David
 */
import java.util.Scanner;
        
public class EjercicioResueltoN14 {

    public static void main(String[] args) {
        double ventasd1, ventasd2, ventasd3, salario, porventas, tventas;
        double salv1, salv2, salv3;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingerese las ventas del departamento 1");
        ventasd1 = entrada.nextDouble();
        
        System.out.println("ingerese las ventas del departamento 2");
        ventasd2 = entrada.nextDouble();
        
        System.out.println("ingerese las ventas del departamento 3");
        ventasd3 = entrada.nextDouble();
        
        System.out.println("ingerese el salario base de los vendedores");
        salario = entrada.nextDouble();
        
        tventas = (ventasd1 + ventasd2 + ventasd3);     
        porventas = (0.3*tventas);
        
        if(ventasd1 > porventas){
            salv1 = (salario + (0.2*salario));
        }
        else {
             salv1 = salario;  
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
