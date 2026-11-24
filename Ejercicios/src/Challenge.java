import java.util.Scanner;

public class Challenge {
    public static int countTrue(boolean[] arr){
        int conteo = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]){
                conteo++;
            }
        }
        return conteo;
    }

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas palabras desea enviar?");
        int tamaño = lector.nextInt();
        boolean[] arreglo = new boolean[tamaño];
        System.out.println("Ingresa true/false y da enter:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa la palabra [%b]:".formatted(arreglo[i]));
            arreglo[i] = lector.nextBoolean();
        }
        System.out.println("La palabra True aparece: %d veces".formatted(countTrue(arreglo)));
    }
}