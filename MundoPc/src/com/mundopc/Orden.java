package com.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado la cantidad de computadoras: " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Lista de computadoras:");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
