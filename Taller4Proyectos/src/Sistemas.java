/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Sistemas  extends Profesion{
    int cant;
    String Soft;

    public Sistemas() {
    }

    public Sistemas(int cant, String Soft) {
        this.cant = cant;
        this.Soft = Soft;
    }

    public void setCant(int cant) {
        this.cant = cant;
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

    public void setSoft(String Soft) {
        this.Soft = Soft;
    }

    @Override
    public String getNombrePro() {
        return super.getNombrePro(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEspecia() {
        return Especia;
    }

    public int getCant() {
        return cant;
    }

    public String getSoft() {
        return Soft;
    }
    
}
