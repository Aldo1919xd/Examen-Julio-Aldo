/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author caleb
 */
public class Docente {

    private String Codido;
    private String Nombre;
    private String Direccion;
    private Date FechaNacimiento;
    private double Talla;
    private String Correo;

    public Docente(String Codido, String Nombre, String Direccion, Date FechaNacimiento, double Talla, String Correo) {
        this.Codido = Codido;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
        this.Talla = Talla;
        this.Correo = Correo;
    }

    public String getCodido() {
        return Codido;
    }

    public void setCodido(String Codido) {
        this.Codido = Codido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public double getTalla() {
        return Talla;
    }

    public void setTalla(double Talla) {
        this.Talla = Talla;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

}
