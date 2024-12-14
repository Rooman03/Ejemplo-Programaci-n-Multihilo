package org.example;

public class CarreraDeCoches {
    public static void main(String[] args) throws InterruptedException {
        // Crear coches
        Coche coche1 = new Coche("Coche 1");
        Coche coche2 = new Coche("Coche 2");
        Coche coche3 = new Coche("Coche 3");
        Coche coche4 = new Coche("Coche 4");
        Coche coche5 = new Coche("Coche 5");

        // Crear hilos para cada coche
        Thread hilo1 = new Thread(coche1);
        Thread hilo2 = new Thread(coche2);
        Thread hilo3 = new Thread(coche3);
        Thread hilo4 = new Thread(coche4);
        Thread hilo5 = new Thread(coche5);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        // Esperar a que todos los coches lleguen a la metas
        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();

        // Anunciar el ganador (el primero en terminar)
        System.out.println("¡La carrera ha terminado!");
    }
}


