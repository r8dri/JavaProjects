package test;

import domain.Cliente;
import domain.Empleado;

import java.time.LocalDate;

public class TestHerencia {
    static void main(String[] args) {
        Empleado empleado1 = new Empleado("Rodrigo", 30000);
        System.out.println("empleado1 = " + empleado1);
        /*LocalDate fechaReg = LocalDate.now();
        LocalDate fechaReg2 = LocalDate.of(2016, 6, 25);
        Cliente cliente1 = new Cliente("Jessi", 'F', "Teotihuacan, Edo. Mex", 19, fechaReg, true);
        System.out.println("cliente1 = " + cliente1);
        Cliente cliente2 = new Cliente("Lizbeth", 'F', "Otumba, Edo. Mex", 20, fechaReg2, false);
        System.out.println("cliente2 = " + cliente2);*/
    }
}
