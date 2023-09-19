/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entregra3_cap_4_ejercicio_resuelton7;

/**
 *
 * @author David
 */
public class Mayor {
    double a,b;
    
    public Mayor (double a, double b){
        this.a = a;
        this.b = b;
    }
    public String A(){
        if (a > b){
            return ("A es mayor que B");
        }
        
        else if (a==b){
            return("A es igual que B");
        }
        
        else {
            return("A es menor que B");
        }
    }
        
}
