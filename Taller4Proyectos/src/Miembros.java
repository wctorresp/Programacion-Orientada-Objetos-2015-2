/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Miembros {
    String nombres;
    int Cedula;
    String Profesion;

    public Miembros() {
    }

    public Miembros(String nombres, int Cedula, String Profesion) {
        this.nombres = nombres;
        this.Cedula = Cedula;
        this.Profesion = Profesion;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getNombres() {
        return nombres;
    }

    public int getCedula() {
        return Cedula;
    }

    public String getProfesion() {
        return Profesion;
    }
    
}
