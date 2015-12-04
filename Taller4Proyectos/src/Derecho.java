/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Derecho extends Profesion{
    int anosexp;
    String trab;

    public Derecho() {
    }

    public Derecho(int anosexp, String trab) {
        this.anosexp = anosexp;
        this.trab = trab;
    }
  

    public int getAnosexp() {
        return anosexp;
    }

    @Override
    public String getNombrePro() {
        return super.getNombrePro(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEspecia() {
        return Especia;
    }

    public void setTrab(String trab) {
        this.trab = trab;
    }

   

    public void setAnosexp(int anosexp) {
        this.anosexp = anosexp;
    }

    public void setEspecia(String Especia) {
        this.Especia = Especia;
    }

    @Override
    public void setNombrePro(String NombrePro, String Especia) {
        super.setNombrePro(NombrePro, Especia); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombrePro(String NombrePro) {
        this.NombrePro = NombrePro;
    }

    public String getTrab() {
        return trab;
    }

   
    
}
