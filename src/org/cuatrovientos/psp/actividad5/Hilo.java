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
public class Hilo implements Runnable{

    private Thread tarea;
    private String nombre;
    private int numeroIteraciones;
    private long milisegundosEntreIteraciones;
    
    public Hilo(String nombre, int numeroIteraciones, long milisegundos) {
        this.tarea = new Thread();
        this.nombre = nombre;
        this.milisegundosEntreIteraciones = milisegundos;
        this.numeroIteraciones = numeroIteraciones;
        this.run();
    }
    
    @Override
    public void run() {
        do {
        System.out.println(this.nombre + " - iteracion " + this.numeroIteraciones);
        estaVivo();
        this.numeroIteraciones--;
        } while (this.numeroIteraciones == 0);
    }
    
    public void estaVivo(){
        if (this.tarea.isAlive()) {
            System.out.println("I'm alive!");
        }
    }
    
}
