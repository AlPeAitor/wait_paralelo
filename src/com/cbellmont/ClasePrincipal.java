package com.cbellmont;

public class ClasePrincipal {


    private final static int NUM_ALUMNOS = 10;

    ClasePrincipal(){
        HiloProfesor profesor = new HiloProfesor();
        profesor.start();
        for (int i = 0; i < NUM_ALUMNOS; i++){
            HiloAlumno alumno = new HiloAlumno("Alumno " + i, profesor);
            alumno.start();
        }
    }
}
