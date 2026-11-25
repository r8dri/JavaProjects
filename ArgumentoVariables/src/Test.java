public class Test {
    static void main(String[] args) {
        imprimirNumeros(2, 5, 6, 8, 9, 10, 15);
        variosParametros("Rodrigo", 2, 3, 5, 6, 7);

    }
    // Debe colocarse el argumento variable al final de todos los argumentos de la funcion
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + i + numeros[i]);
        }
    }
}
