import domain.Persona;

public class TestForEach {
    public static void main(String[] args) throws Exception {
        int[] numeros = {2, 3, 5, 6, 7, 9};
        for(int numero: numeros) {
            System.out.println("Edad = " + numero);
        }

        System.out.println("");

        Persona[] personas1 = {new Persona("Alexis"), new Persona("Rodrigo"), new Persona("Jessi"), new Persona("Lizbeth")};
        for(Persona persona: personas1) {
            System.out.println("persona = " + persona);
        }
    }
}
