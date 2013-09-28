/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.Asignatura;

import Datos.Usuario.Profesor;
import Datos.calendario.Interface;
import java.util.ArrayList;

/**
 *
 * @author GeOrge
 */
public class Departamento implements Interface {

    private String departamento;
    private ArrayList<Asignatura> asignatura = new ArrayList<>(); 
    private ArrayList<Profesor> profesor = new ArrayList<>(); 
    
    public Departamento(String _departamento) {
        departamento = _departamento;
    }
    
    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void agregar(Asignatura _asignatura) {
        asignatura.add(_asignatura);
    }
    
    public void agregar(Profesor _profesor) {
        profesor.add(_profesor);
    }
}