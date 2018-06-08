/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author cvare
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String identidad;
    private String estadoCivil;

    public Persona(String nombre, int edad, String identidad, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
