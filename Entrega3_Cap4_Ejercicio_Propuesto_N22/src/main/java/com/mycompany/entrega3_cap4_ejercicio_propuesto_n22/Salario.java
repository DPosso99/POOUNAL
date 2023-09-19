/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_cap4_ejercicio_propuesto_n22;

/**
 *
 * @author David
 */
public class Salario {
    double Horas_T,Vlr_Hora;
    String Nombre;

    public Salario (double Horas_T, double Vlr_Hora, String Nombre){
        this.Horas_T = Horas_T;
        this.Vlr_Hora = Vlr_Hora;
        this.Nombre = Nombre;
    }
    
    public double Salario(){
        return(Vlr_Hora * Horas_T);
    }
    
}
