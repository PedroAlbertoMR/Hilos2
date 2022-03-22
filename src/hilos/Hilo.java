/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author AlumnoM
 */
public class Hilo extends Thread {

    private int numeroDeRepeticiones;
    //private int id;

    Hilo(int numeroDeRepeticiones, String nombre) {
        this.numeroDeRepeticiones = numeroDeRepeticiones;
        System.out.println("Creando");
        System.out.println("Creando");
        System.out.println("Creando");
        setName(nombre);
    }

    public void run() {
        for (int i = 0; i < numeroDeRepeticiones; i++) {
            System.out.println("Mensaje del hilo " + getName() + " en la intaracion " + i);
            System.out.println("Mensaje del hilo " + getName() + " en la intaracion " + i);
        }
    }
}
