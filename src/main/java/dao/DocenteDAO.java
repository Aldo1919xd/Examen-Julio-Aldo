/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Docente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caleb
 */
public class DocenteDAO {
      private List<Docente> lista = new ArrayList<Docente>();
    private int ubicacion = -1;

    public boolean esVacio() {
        return lista.isEmpty();
    }

    public void primero() {
        ubicacion = 0;
    }

    public void ultimo() {
        ubicacion = lista.size() - 1;
    }

    public void anterior() {
        if (ubicacion > 0) {
            ubicacion--;
        }
    }

    public void siguiente() {
        if (ubicacion < lista.size() -1) {
            ubicacion++;
        }
    }
    
    public Docente getDocente(){
        return lista.get(ubicacion);
    }
    public void  setDocente(Docente a) {
         lista.set(ubicacion,a);
    }
    public void agregar(Docente a) {
        lista.add(a);
        ubicacion = lista.size()-1;
    }

    public String imprimir() {
        String resultado = "";
        for (Docente d : lista) {
            resultado += d.getCodigo()+"---"+d.getNombre()+"--" + d.getDireccion()+"\n";
        }
        return resultado;
    }
    public double promedioEdad() {
    if (lista.isEmpty()) return 0;

    int suma = 0;
    for (Docente d : lista) {
        Date fecha = d.getFechaNacimiento();
        LocalDate nacimiento = fecha.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        int edad = Period.between(nacimiento, LocalDate.now()).getYears();
        suma += edad;
    }
    return (double) suma / lista.size();
      }

     public String tallaMM() {
    if (lista.isEmpty()) return "Lista vacía";

    double min = lista.get(0).getTalla();
    double max = lista.get(0).getTalla();

    for (Docente d : lista) {
        double t = d.getTalla();
        if (t < min) min = t;
        if (t > max) max = t;
    }

    return "Talla mínima: " + min + ", Talla máxima: " + max;
     } 
    public void Eliminar() {
        lista.remove(ubicacion);
        ubicacion = lista.size()-1;
    }        
}
