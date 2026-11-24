import java.util.Scanner;

public class Words {
    public static int countWords(String s) {
        String[] arreglo = s.split(" ");
        return arreglo.length;
    }

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = lector.nextLine();
        System.out.println("La frase '%s' tiene un total de %d palabras".formatted(frase, countWords(frase)));
    }
}
