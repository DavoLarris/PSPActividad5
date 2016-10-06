/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuatrovientos.psp.actividad5;

/**
 *
 * @author DavoLarris
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo hiloA, hiloB, hiloC; 
        hiloA = new Hilo("Soy A", 10, 1000); 
        hiloB = new Hilo("Soy B", 15, 2000); 
        hiloC = new Hilo("Soy C", 9, 500);
    }
    
}
