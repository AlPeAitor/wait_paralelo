package com.cbellmont;

public class Main {

    public static void main(String[] args) {
        // Imaginemos que estamos en clase.
        // Cada alumno es un hilo.
        // El profesor es otro hilo diferente.
        // Los alumnos no pueden tocar el ordenador hasta que han realizado la desinfeccion y para eso es necesario que
        // el profesor este en clase e inicie el proceso de desinfección.
        // Hay alumnos que pueden llegar tarde a clase.
        // El profesor esta hasta las narices de ir a desinfectar a los que llegan tarde uno a uno.
        // El profesor va a esperar 5 segundo a que llegado la primera tanta de alumno para desinfectarles a todos a la vez.
        // A los 31 segundos realizará una segunda tanta de desinfecciones con los rezagados.
        // El profesor inicia el proceso de desinfeccion y le lleva un segundo por alumno, de uno en uno.

        // La llegada de los alumnos el aleatoria, por ejemplo

        /*
        boolean llegaTarde = r.nextBoolean();

        if (!llegaTarde) {
            sleepingTime = r.nextInt(4000);
        } else {
            sleepingTime = r.nextInt(20000) + 5000;
        } */

        new ClasePrincipal();
    }
}
