/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap3_ejercicio_propueston18;

/**
 *
 * @author David
 */
public class Salarios {
    String nombre,codigo;
    double num_horas, vlr_hora,porc_retencion, salario_Bruto; 
    
    public Salarios(String codigo,String nombre, double num_horas, double vlr_hora, double retencion ) {
        this.codigo = codigo;
        this.nombre = nombre; 
        this.num_horas = num_horas;
        this.vlr_hora = vlr_hora;
        porc_retencion = retencion/100;
    }
    
    public double salario_Bruto(){
        return(num_horas * vlr_hora); 
    }
    
    public double salario_Neto(){
        salario_Bruto = this.salario_Bruto();
        return(salario_Bruto - (salario_Bruto * porc_retencion)); 
    }
    
}
