package persona;

public class Persona {

    public String nombre;
    public String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Nombre: " + apellido);
    }

    static void main(String[] args) {
        Persona persona1 = new Persona("Rodrigo", "Villa");
        persona1.mostrarInfo();
    }
}
