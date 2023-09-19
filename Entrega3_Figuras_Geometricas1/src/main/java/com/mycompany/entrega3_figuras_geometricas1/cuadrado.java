/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_figuras_geometricas1;

/**
 *
 * @author David
 */
public class cuadrado {
        double lado;
    //constructor
    public cuadrado(double lado){
    this.lado = lado;
    }
    //metodos
    public double calcularArea(){
    return lado*lado;
    }
    public double calcularPerimetro(){
    return 4*lado;
    }
}
