package mx.com.ventas.test;

import mx.com.ventas.Orden;
import mx.com.ventas.Producto;

public class VentasTest {
    static void main(String[] args) {
        Producto producto1 = new Producto("Vaso", 199.99);
        Producto producto2 = new Producto("Mochila", 749.50);
        Producto producto3 = new Producto("Audifonos", 4999.89);
        Producto producto4 = new Producto("Laptop", 10570.99);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);

        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);

        orden2.mostrarOrden();

    }
}
