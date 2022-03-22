/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class Ejemplo3Tema2 {

    static int NUMERO_HILOS = 2;
    static int NUMERO_ITERACIONES = 4;

    public static void main(String[] args) {

        ArrayList<Hilo> hilos = new ArrayList<>();

        for (int i = 0; i < NUMERO_HILOS; i++) {
            hilos.add(new Hilo(NUMERO_ITERACIONES, "hilo " + i));
        }

        for (Hilo x : hilos) {
            x.start();
        }

        try {
            for (Hilo y : hilos) {
                y.join();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("PROGRAMA FINALIZADO");
    }
}
