package test;

import domain.Persona;

public class PersonaPrueba {
    static void main(String[] args) {
        imprimir(guardar("Rodrigo"));
        imprimir(guardar("Jessi"));
        imprimir(guardar("Alexis"));
        imprimir(guardar("Lizbeth"));

    }
    public static Persona guardar(String nombre){
        return new Persona(nombre);
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}

