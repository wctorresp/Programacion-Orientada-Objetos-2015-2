/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Equipo {
    public String Origen;
    public String Profesion;
    String Nombre;

    public Equipo() {
    }

    public Equipo(String Origen, String Profesion, String Nombre) {
        this.Origen = Origen;
        this.Profesion = Profesion;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    

 
    
    
    
}
