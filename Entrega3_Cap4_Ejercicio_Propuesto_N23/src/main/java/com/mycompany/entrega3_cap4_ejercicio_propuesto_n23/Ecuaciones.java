/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_cap4_ejercicio_propuesto_n23;

/**
 *
 * @author David
 */
public class Ecuaciones {
    double A,B,C;
    double x,y;
    String tipo = "";
    
    public Ecuaciones(double a,double b, double c) {
        A = a;
        B = b;
        C = c;
        x = Math.pow(B, 2) - (4*A*C);
        y = Math.sqrt(x);

    }
    public String tipoSolucion(){
        if (x>0){
        tipo = "distintas";
        return ("La ecuacion tiene soluciones reales distintas");
        }else if(x==0){
        tipo = "iguales";
        return ("La ecuacion tiene soluciones reales iguales");
        }else{
        tipo = "sin solucion";
        return ("La ecuacion no posee soluciones reales");
        }
    }
    
    public String soluciones(){
        this.tipoSolucion();
        switch (tipo) {
            case "distintas" -> {
                double solucion1 = (-B + y)/(2*A);
                double solucion2 = (-B - y)/(2*A);
                return ("X1= "+ solucion1 +" X2= " +solucion2);
            }
            case "iguales" -> {
                double solucion1 = (-B + y)/(2*A);
                double solucion2 = (-B - y)/(2*A);
                return ("X1= "+ solucion1 +" X2= " +solucion2);
            }
            default -> {
                return "";
            }
        }
    }

    
}
