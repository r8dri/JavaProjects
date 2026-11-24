package testencapsulamiento;

import encapsulamiento.*;

public class PersonaPrueba {
    static void main(String[] args) {
        Persona persona1 = new Persona("Rodrigo", 11000.00, false);
        persona1.setNombre("Alexis Rodrigo Villa Siordia");
        persona1.setSueldo(30000.00);
        persona1.setEliminado(true);
        System.out.printf("El nombre de la persona es: %s%n", persona1.getNombre());
        System.out.printf("El sueldo de la persona es: %f%n", persona1.getSueldo());
        System.out.printf("La persona esta eliminada: %b%n", persona1.isEliminado());

        System.out.println(persona1.toString());

    }
}
