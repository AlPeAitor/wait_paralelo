package com.cbellmont;

import java.util.Random;

public class HiloAlumno extends Thread {

    public String nombre;

    private final int sleepingTime;
    private final HiloProfesor profesor;
    boolean desinfectado = true;

    public HiloAlumno(String nombre, HiloProfesor profesor){
        this.nombre = nombre;
        Random r = new Random();
        boolean llegaTarde = r.nextBoolean();

        if (!llegaTarde) {
            sleepingTime = r.nextInt(4000);
        } else {
            sleepingTime = r.nextInt(20000) + 5000;
        }
        this.profesor = profesor;
    }

    @Override
    public void run() {
        try {
            sleep(sleepingTime);
            System.out.println("Ha llegado " + nombre);
            System.out.println(nombre + " espera a que el profesor le desinfecte ");
            profesor.desinfectar(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void serDesinfectado() {
        desinfectado = true;
    }
}
