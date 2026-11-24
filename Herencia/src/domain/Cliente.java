package domain;

import java.time.LocalDate;

public class Cliente extends Persona{
    private int idCliente;
    private LocalDate fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, char genero, String direccion, int edad, LocalDate fechaRegistro, boolean vip) {
        super(nombre, genero, direccion, edad);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("vip=").append(vip);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
