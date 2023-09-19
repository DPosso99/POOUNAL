/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_figuras_geometricas1;

/**
 *
 * @author David
 */
public class rectangulo {
    double base, altura;
//constructor
public rectangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
    }
    //metodos
    public double calcularArea(){
    return base*altura;
    }
    public double calcularPerimetro(){
    return (2*base)+(2+altura);
    }
}
