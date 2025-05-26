/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Docente;
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
    
    public void Eliminar() {
        lista.remove(ubicacion);
        ubicacion = lista.size()-1;
    }        
    
   
}
