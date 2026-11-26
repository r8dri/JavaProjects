package domain;

import java.util.Arrays;

public class Gerente extends Empleado {
    private String area;
    private final int idGerente;
    private static int contadorGerentes;
    private String[] sucursalesCargo;
    private static final int MAX_SUCURSALES = 3;

    private Gerente(String nombre, int edad, String ciudad) {
        super(nombre, edad, ciudad);
        this.idGerente = ++Gerente.contadorGerentes;
    }

    public Gerente(String nombre, int edad, String ciudad, String area, String[] sucursalesCargo) {
        this(nombre, edad, ciudad);
        this.area = area;
        this.sucursalesCargo = new String[Gerente.MAX_SUCURSALES];
    }

    public void agregarSucursales(String[] sucursal) {
        if(sucursal.length < (Gerente.MAX_SUCURSALES + 1)) {
            for (int i = 0; i < sucursal.length; i++) {
                sucursalesCargo[i] = sucursal[i];
            }
        } else {
            System.out.println("Un gerente no puede tener mas de " + Gerente.MAX_SUCURSALES + " sucursales a su cargo.");
        }
    }

    public String[] getSucursalesCargo() {
        return sucursalesCargo;
    }

    public void setSucursalesCargo(String[] sucursalesCargo) {
        this.sucursalesCargo = sucursalesCargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String traerInfo() {
        return super.traerInfo() + " Id Gerente: " + this.idGerente + " Area: " +
                this.area + ((this.sucursalesCargo != null && this.sucursalesCargo[0] != null) ?
                " Sucursales a cargo: " + Arrays.toString(Arrays.stream(this.sucursalesCargo)
                .filter(s -> s != null && !s.trim().isEmpty()).toArray(String[]::new)) : " ");
    }
}
