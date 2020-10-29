package com.cbellmont;

public class ProcesoDeDesinfeccion {

    public synchronized void comenzarDesinfeccion(){
        notifyAll();
    }

    public synchronized void desinfectarAlumno(HiloAlumno alumno){
        try {
            wait();
            System.out.println("El profesor empieza a desinfectar a " + alumno.nombre);
            Thread.sleep(1000);
            alumno.serDesinfectado();
            System.out.println(alumno.nombre + " desinfectado");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
