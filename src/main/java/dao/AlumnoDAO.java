/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Alumno;
import dto.NodoSimple;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class AlumnoDAO {
    NodoSimple primero;
    NodoSimple ultimo;
    
    public AlumnoDAO(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public void agregarInicio(Alumno a){
        NodoSimple nuevo = new NodoSimple();
        nuevo.datos = a;
        
        if(primero == null){
            primero = ultimo = nuevo;
        }else{
            nuevo.siguiente = primero;
            primero = nuevo;
        }
    }
    
    public void eliminarFinal(){
        if(primero == null){
            System.out.println("No hay nada que eliminar, está vacío");
        }else if(primero.siguiente == null){
            primero = ultimo = null;
        }
        else{
            NodoSimple temp = primero;
            while(temp.siguiente != null){
                if(temp.siguiente.siguiente == null){
                    break;
                }
                temp = temp.siguiente;
            }
            temp.siguiente = null;
            ultimo = temp;
        }
    }
    
    public void mostrarAtrasAdelante(){
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }
        StringBuilder sb = new StringBuilder();
        mostrarAtrasAdelanteRecursivo(primero, sb); 
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    private void mostrarAtrasAdelanteRecursivo(NodoSimple nodo, StringBuilder sb) {
        if (nodo == null) {
            return;
        }
        mostrarAtrasAdelanteRecursivo(nodo.siguiente, sb);
        sb.append(nodo.datos.getCodiProd()).append(" - ")
          .append(nodo.datos.getNombProd()).append(" - ")
          .append(nodo.datos.getPrecProd()).append(" - ")
          .append(nodo.datos.getCantProd()).append(" - ")
          .append(nodo.datos.getCostoProd()).append("\n");
    }
    
    public void promedioCostosProductos(){
        
    }
    
}

