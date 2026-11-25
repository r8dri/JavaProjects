package mundopc;

import com.mundopc.*;

public class MundoPC {
    static void main(String[] args) {
        Raton raton1 = new Raton("Raton", "Razer");
        Raton raton2 = new Raton("Raton", "Sony");

        Teclado teclado1 = new Teclado("Teclado", "Logitech");
        Teclado teclado2 = new Teclado("Teclado", "Asus");

        Monitor monitor1 = new Monitor("LG", 22.5);
        Monitor monitor2 = new Monitor("Samsung", 27.2);

        Computadora computadora1 = new Computadora("PC VIRTUS MX-261", monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora("PC BYRON MM-333", monitor2, teclado2, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();
    }
}
