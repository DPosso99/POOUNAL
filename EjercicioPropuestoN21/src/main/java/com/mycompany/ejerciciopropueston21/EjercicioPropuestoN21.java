/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopropueston21;

/**
 *
 * @author David
 */
import java.util.Scanner; //Importamos Scanner para pedir valores al usuario

public class EjercicioPropuestoN21 {

    public static void main(String[] args) {
        
        double a, b, c, perimetro, semiper, area; //declaramos los tipos de datos que vamos a usar
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("ingrese el valor del lado A: ");
        a = entrada.nextDouble();
        
        System.out.print("ingrese el valor del lado B: ");
        b = entrada.nextDouble();
        
        System.out.print("ingrese el valor del lado C: ");
        c = entrada.nextDouble();
        
        perimetro = (a + b + c); //calculamos el perimetro como la suma de sus lados.
        semiper = ((a + b + c)/2);//calculamos el semiperimetro como la suma de sus lados sobre 2. 
        area = (Math.sqrt((semiper * (semiper - a) * (semiper - b) * (semiper - c))));
        /*El area la calculamos con la formula de Heron a partir de su semiperimetro */
        
        System.out.print("El perimetro del triangulo es: " + perimetro + '\n');
        System.out.print("El semiperimetro del triangulo es: " + semiper + '\n');
        System.out.print("El area del triangulo es: " + area + '\n'); 
    }
}
