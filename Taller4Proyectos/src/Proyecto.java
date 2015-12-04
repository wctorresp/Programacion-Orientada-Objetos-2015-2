/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Proyecto {
    public String Nombre;
    
    public String Equipo;

    public Proyecto(String Nombre, String Equipo) {
        this.Nombre = Nombre;
        
        this.Equipo = Equipo;
    }

    public Proyecto() {
    }

    
    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  
    public String getEquipo() {
        return Equipo;
    }

    public String getNombre() {
        return Nombre;
    }

    

    
           
            
}
