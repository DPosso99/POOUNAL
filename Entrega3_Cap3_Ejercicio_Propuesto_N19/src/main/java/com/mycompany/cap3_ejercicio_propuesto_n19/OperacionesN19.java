/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap3_ejercicio_propuesto_n19;

/**
 *
 * @author David
 */
public class OperacionesN19 {
    double lado;
    
    public OperacionesN19(double lado) {
        this.lado = lado;
    }
    
    public double altura() {
        return(lado*Math.sqrt(3))/2;
    }
    
    public double area(){
        return ((Math.pow(lado,2)*Math.sqrt(3))/4);
    }
    
    public double perimetro(){
        return (3*lado);
    }
}
