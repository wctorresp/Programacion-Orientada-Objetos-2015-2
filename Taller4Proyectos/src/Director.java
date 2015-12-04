/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Director  {
    String nombre;
    String Ocupacion;
    public Director() {
    }

    public Director(String nombre, String Ocupacion) {
        this.nombre = nombre;
        this.Ocupacion = Ocupacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    
    
}
