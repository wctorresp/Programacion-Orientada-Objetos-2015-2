/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class Mecatronica extends Profesion{
    int edad;
    int proy;

    public Mecatronica() {
    }

    public Mecatronica(int edad, int proy) {
        this.edad = edad;
        this.proy = proy;
    }

    @Override
    public String getNombrePro() {
        return super.getNombrePro(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEspecia() {
        return Especia;
    }

    public int getEdad() {
        return edad;
    }

    public int getProy() {
        return proy;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProy(int proy) {
        this.proy = proy;
    }

    public void setEspecia(String Especia) {
        this.Especia = Especia;
    }

    public void setNombrePro(String NombrePro) {
        this.NombrePro = NombrePro;
    }

    @Override
    public void setNombrePro(String NombrePro, String Especia) {
        super.setNombrePro(NombrePro, Especia); //To change body of generated methods, choose Tools | Templates.
    }

  
}
