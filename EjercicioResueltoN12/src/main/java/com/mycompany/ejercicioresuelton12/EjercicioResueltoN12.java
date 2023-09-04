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
        double horastra, vlrhora, hrextras, salario, triples; 
        String nombre;
        
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();
        
        System.out.print("Ingrese el numero de horas trabajadas: ");
        horastra = entrada.nextDouble();
        
        System.out.print("Ingrese el valor de la hora de trabajo: ");
        vlrhora = entrada.nextDouble();
        
        if (horastra > 40) { 
            hrextras = (horastra - 40); 
            
            if (hrextras > 8) {
                triples = (hrextras - 8);
                salario = (40*vlrhora) + (vlrhora * 16) + (vlrhora * 3 * triples);
                   }
             else { 
                salario = (40 * vlrhora) + (hrextras * 2 * vlrhora) ; 
                   }
            }
        else {
            salario = (horastra * vlrhora);
             }
        System.out.print("El trabajador: " + nombre + " devengo: $ " + salario);
        }
    }
