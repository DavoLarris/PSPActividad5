/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuatrovientos.psp.actividad5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavoLarris
 */
public class Hilo implements Runnable{

    private Thread tarea;
    private String nombre;
    private int numeroIteraciones;
    private long milisegundosEntreIteraciones;
    private int cont = 0;
    
    public Hilo(String nombre, int numeroIteraciones, long milisegundos) {
        this.tarea = new Thread( this );
        this.nombre = nombre;
        this.milisegundosEntreIteraciones = milisegundos;
        this.numeroIteraciones = numeroIteraciones;
        tarea.start();
    }
    
    @Override
    public void run() {
        while (cont != this.numeroIteraciones) {
        System.out.println(this.nombre + " - iteracion " + cont);
        estaVivo();
            try {
                tarea.sleep(milisegundosEntreIteraciones);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        cont++;
        };
    }
    
    public void estaVivo(){
        if (this.tarea.isAlive()) {
            System.out.println(this.nombre + " - I'm alive!");
        }
    }
    
}
