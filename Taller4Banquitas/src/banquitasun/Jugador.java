package banquitasun;
/**
 * @author Camilo Torres
 */
import java.util.*; 

public class Jugador {
    private String nombre;
    private String apellido;
    private int edad; 
    private String habilidad;
    private int goles;
    
    public void setGoles(int goles){
    
    }
       
    public void setJugador(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nIngresando jugador: ");
        System.out.print("Nombre Apellido: ");    
        this.nombre = in.next();  
        this.apellido = in.next();
        System.out.print("Edad: ");    
        this.edad = in.nextInt(); 
        System.out.print("Habilidad: ");    
        this.habilidad = in.next();
        
    }
    
    public String getNombreJugador(){
        return this.nombre;   
    }
    
    public String getApellidoJugador(){
        return this.apellido;   
    }
}
