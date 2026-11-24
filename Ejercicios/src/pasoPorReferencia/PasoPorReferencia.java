package pasoPorReferencia;

import persona.Persona;

public class PasoPorReferencia {
    static void main(String[] args) {
        Persona persona1 = new Persona("Rodrigo" ,"Villa");
        System.out.println("Nombre = " + persona1.nombre);
        System.out.println("Apellido = " + persona1.apellido);
        persona1 = cambiarValor(persona1);
        System.out.println("Nombres modificados");
        System.out.println("Nombre = " + persona1.nombre);
        System.out.println("Apellido = " + persona1.apellido);
    }
    public static Persona cambiarValor(Persona persona) {
        persona.nombre = "Jessi";
        return persona;
    }
}

