package test;

import domain.Persona;

public class testArreglo1 {
    static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Rodrigo", 27);
        personas[1] = new Persona("Jessi", 19);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona [" + (i + 1) + "]: " + personas[i]);
        }
    }
}
