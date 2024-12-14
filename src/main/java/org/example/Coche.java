package org.example;
public class Coche implements Runnable {
    private String nombre;
    private int distanciaRecorrida;
    private static final int DISTANCIA_META = 100;

    public Coche(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }

    @Override
    public void run() {
        while (distanciaRecorrida < DISTANCIA_META) {
            // Avanzar el coche en pequeños incrementos aleatorios
            int avance = (int) (Math.random() * 10) + 1;
            distanciaRecorrida += avance;
            if (distanciaRecorrida > DISTANCIA_META) {
                distanciaRecorrida = DISTANCIA_META; // Limitar a la meta
            }
            System.out.println(nombre + " ha recorrido: " + distanciaRecorrida + " unidades.");

            try {
                Thread.sleep((int) (Math.random() * 1000) + 500); // Espera aleatoria entre 0.5s y 1.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha llegado a la meta.");
    }

    public String getNombre() {
        return nombre;
    }
}
