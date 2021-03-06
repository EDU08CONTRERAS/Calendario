/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Aula.Aula;
import java.util.ArrayList;


/**
 * Metodo que permite administrar las aulas
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
public class AulaCls implements Interface{

    private static ArrayList<Aula> aula = new ArrayList<>();
    ArchivoCls insArchivo = new ArchivoCls();
    
    /**
     * Metodo de la interface, que permite insertar una nueva aula en la lista de aulas
     * @param args 
     */
    @Override
    public void insertar(Object args) {
        aula.add((Aula)args);
    }
    
    /**
     * Metodo de la interface, que permite guardar la lista de aulas en su correspondiente archivo
     */
    @Override
    public void guardar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(int i=0; i < aula.size(); i++)
            lista.add(aula.get(i));
        insArchivo.guardar("aula", lista);
    }
    
    public static ArrayList<Aula> getAula() {
        return aula;
    }

    public static void setAula(ArrayList<Aula> aula) {
        AulaCls.aula = aula;
    }
}
