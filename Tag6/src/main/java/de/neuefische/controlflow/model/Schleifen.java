package de.neuefische.controlflow.model;

public class Schleifen {
// static = Methode hängt an Klasse, nicht an Objekt

    public static int fakultätMitFor(int fakultät) {


        int ergebnis = 1;

        for (int i = 1; i <= fakultät; i++) {

            ergebnis *= i;

        }
        return ergebnis;
    }

    public static int fakultätMitWhile(int fakultät) {

        int ergebnis = 1;
        int i = 1;

        while (i <= fakultät) {

            ergebnis *= i;
            i++;

        }
        return ergebnis;
    }


}
