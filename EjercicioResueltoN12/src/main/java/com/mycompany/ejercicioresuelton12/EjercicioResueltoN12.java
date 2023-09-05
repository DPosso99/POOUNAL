/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelton12;

/**
 *
 * @author David
 */
import java.util.Scanner;
        
public class EjercicioResueltoN12 {

    public static void main(String[] args) {
        double horastra, vlrhora, hrextras, salario, triples; //declaramos el tipo de variable con el que vamos a trabajar 
        String nombre; //usamos String para almacenar texto. 
        
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese el nombre del trabajador: "); //Entrada para el usuario, ingresa el nombre del trabajador
        nombre = entrada.nextLine();
        
        System.out.print("Ingrese el numero de horas trabajadas: ");
        horastra = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de la hora de trabajo: ");
        vlrhora = entrada.nextDouble();
        
        if (horastra > 40) {  //condicional para preguntar si el numero de horas semanales trabajadas es mayor a 40.  
            hrextras = (horastra - 40); 
        /*aqui se calcula la diferencia del total de horas trabajadas menos las 40 horas que es la jornada normal.  
            para obtener las horas extras*/
            if (hrextras > 8) { // Si las horas extras son mayores a 8, se pagan al triple y se usaron esas operaciones. 
                triples = (hrextras - 8);
                salario = (40*vlrhora) + (vlrhora * 16) + (vlrhora * 3 * triples);
                   }
             else {  //si las horas extras son menores o iguales a 8 se pagan al doble. 
                salario = (40 * vlrhora) + (hrextras * 2 * vlrhora) ; 
                   }
            }
        else { // Si las horas trabajadas son menores a 40 se calculoa el salario sin horas extras. 
            salario = (horastra * vlrhora);
             }
        System.out.print("El trabajador: " + nombre + " devengo: $ " + salario);
        }
    }
