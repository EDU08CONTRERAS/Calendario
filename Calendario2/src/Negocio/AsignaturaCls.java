/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Asignatura.Asignatura;
import java.util.ArrayList;


/**
 *
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class AsignaturaCls {
    
    private static ArrayList<Asignatura> asignatura = new ArrayList<>();
    
    public void insertar(Object args) {
        asignatura.add((Asignatura)args);
    }
    
    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(ArrayList<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }

    
    
}