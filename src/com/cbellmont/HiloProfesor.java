package com.cbellmont;

public final class HiloProfesor extends Thread {

    ProcesoDeDesinfeccion desinfeccion = new ProcesoDeDesinfeccion();
    @Override
    public void run() {
        esperarAlumnosParaDesinfectar();
    }

    public void esperarAlumnosParaDesinfectar() {
        try {
            sleep(5000);

            // primera desinfeccion
            System.out.println("===== Empiezo la PRIMERA desinfeccion =====");
            desinfeccion.comenzarDesinfeccion();

            sleep(26000);
            System.out.println("===== Empiezo la SEGUNDA desinfeccion =====");
            desinfeccion.comenzarDesinfeccion();
            // segunda desinfeccion

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void desinfectar(HiloAlumno alumno){
        desinfeccion.desinfectarAlumno(alumno);
    }
}
