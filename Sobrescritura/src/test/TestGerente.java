package test;

import domain.*;

public class TestGerente {
    static void main(String[] args) {
        String[] sucursales = {"Teotihuacan", "Colon"};
        Gerente gerente1 = new Gerente("Alexis Villa", 27, "Mexico", "Dental", sucursales);
        gerente1.agregarSucursales(sucursales);
        System.out.println("gerente1 = " + gerente1.traerInfo());
    }


}
