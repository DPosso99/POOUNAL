/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_figuras_geometricas1;

/**
 *
 * @author David
 */
public class trianguloRectangulo {
    double base, altura;
    //constructor
    public trianguloRectangulo(double base,double altura){
    this.base = base;
    this. altura = altura;
    }
    //metodos
    public double calcularArea(){
    return (base*altura/2);
    }
    public double calcularPerimetro(){
    return (base+altura + calcularHipotenusa());
    }
    public double calcularHipotenusa(){
    return Math.pow(base*base + altura*altura, 0.5);
    }
    public String determinarTipoTriangulo(){
    if ((base == altura) && (base == calcularHipotenusa()) && (altura ==
    calcularHipotenusa())){
    return ("Es un triangulo equilatero");
    }else if((base!=altura)&&(base != calcularHipotenusa()) && (altura !=
    calcularHipotenusa())){
    return ("Es un triangulo escaleno");
    }else{
    return("Es un triangulo isosceles");
        }
    }

}
