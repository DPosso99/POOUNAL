/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_figuras_geometricas1;

/**
 *
 * @author David
 */
public class circulo {
        double radio;
    //constructor
    public circulo(double radio){
    this.radio = radio;
    }
    //metodos
    public double calcularArea() {
    return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerimetro(){
    return 2*Math.PI*radio;
    }
}
