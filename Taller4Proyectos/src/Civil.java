/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Civil extends Profesion{
    int experiencia;
    int can;

    public Civil(int experiencia, int can) {
        this.experiencia = experiencia;
        this.can = can;
    }
    public Civil() {
    }

    public String getEspecia() {
        return Especia;
    }

    @Override
    public String getNombrePro() {
        return super.getNombrePro(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getExperiencia() {
        return experiencia;
    }



    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void setNombrePro(String NombrePro, String Especia) {
        super.setNombrePro(NombrePro, Especia); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombrePro(String NombrePro) {
        this.NombrePro = NombrePro;
    }

    public void setEspecia(String Especia) {
        this.Especia = Especia;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

  
}
