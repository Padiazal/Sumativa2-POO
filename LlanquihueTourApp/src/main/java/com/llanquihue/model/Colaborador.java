package com.llanquihue.model;

/**
 * Representa a un colaborador (guía, operador o proveedor) de la agencia.
 *
 */
public class Colaborador {
    private final String rut;
    private final String nombre;
    private final String rol;
    private final String contacto;

    public Colaborador(String rut, String nombre, String rol, String contacto) {
        this.rut = rut;
        this.nombre = nombre;
        this.rol = rol;
        this.contacto = contacto;
    }

    // Getters y no Setters por que son main
    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
    public String getRol() { return rol; }
    public String getContacto() { return contacto; }


    @Override
    public String toString() {
        return "Colaborador [RUT=" + rut + ", Nombre=" + nombre + ", Rol=" + rol + ", Contacto=" + contacto + "]";
    }
}
