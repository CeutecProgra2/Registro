/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.util.ArrayList;

/**
 *
 * @author cvare
 */
public class Registro {
    public ArrayList<Persona> personas = new ArrayList<>();
    
    public void agregar(String nombre, int edad, String identidad, String estadoCivil){
        Persona persona = new Persona(nombre,edad,identidad,estadoCivil);
        personas.add(persona);
    }
}
