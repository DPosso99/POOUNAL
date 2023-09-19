/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrega3_cap4_ejercicio_resuelton10;

/**
 *
 * @author David
 */
public class Matricula {
    double Patrimonio;
        int Estrato, Constante;
        
        public Matricula(double Patrimonio, int Estrato){
            this.Patrimonio = Patrimonio;
            this.Estrato = Estrato;
            Constante = 50000;
        }
        
        public double Valor_Total(){
                 if(Patrimonio >  2000000 && Estrato >3){
            return (Constante + Patrimonio * 0.3);
            }
        
        else {
            return (Constante);
            }
        }
}
