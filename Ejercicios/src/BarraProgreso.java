import java.util.InputMismatchException;
import java.util.Scanner;

public class BarraProgreso {
    public static String progressBar(int n){
        char[] array = new char[10];
        int llenos = n / 10;
        if (n < 0 || n > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100.");
        }
        for (int i = 0; i < 10; i++) {
            if(i < llenos) {
                array[i] = '#';
            } else {
                array[i] = '-';
            }
        }
        return new String(array);
    }

    static void main() {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingrese el porcentaje del progreso (0-100):");
            int progreso = lector.nextInt();
            System.out.println("Progreso de la barra: [%s] %d%%".formatted(progressBar(progreso), progreso));

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}