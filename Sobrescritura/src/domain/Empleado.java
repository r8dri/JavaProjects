package domain;

public class Empleado {
    private String nombre;
    private final int idEmpleado;
    private int edad;
    private String ciudad;
    private static int contadorEmpleados;

    private Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    public Empleado(String nombre, int edad, String ciudad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String traerInfo() {
        return "Id empleado: " + this.idEmpleado + " Nombre: " + this.nombre
        + " Edad: " + this.edad + " Ciudad: " + this.ciudad;
    }
}
