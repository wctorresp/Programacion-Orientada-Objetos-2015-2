package banquitasun;
/**
 * @author Camilo Torres
 */
import java.util.*;
public class Equipo {
    
    private String nombre;
    private int puntos;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;   
    private int diferenciaGoles;
    Jugador jugadores[]= new Jugador[5];    
    
    
    public void Equipo(){
        
        for(int i=0; i<5; i++){
            this.jugadores[i]=new Jugador();
        }
    }
    
    public void setEquipo(String nombre){
        System.out.println("Ingresando Equipo: ");
        this.nombre = nombre;
        System.out.println("Nombre: " + this.nombre);              
            
        for(int i=0; i<5; i++){
            jugadores[i]=new Jugador();
            jugadores[i].setJugador();            
        }            
    }
    
    public void borrarJugador(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nLos jugadores inscritos en este equipo son: ");
        for(int i=0; i<5; i++){   
            if(jugadores[i].getNombreJugador()==null && jugadores[i].getNombreJugador()==null){
            }
            else{
            System.out.println(jugadores[i].getNombreJugador()+ " " + jugadores[i].getApellidoJugador());
            }
        }
        System.out.println("Indique el nombre del jugador que desea despedir: ");
        String nombreJugador= in.next();
        String apellidoJugador= in.next();
        boolean existe = false;
        for(int i=0; i<5; i++){
            if(jugadores[i].getNombreJugador().equals(nombreJugador)&&jugadores[i].getApellidoJugador().equals(apellidoJugador)){
                jugadores[i]=null;
                jugadores[i]=new Jugador();
                Runtime.getRuntime().gc();
                existe=true;
            }
        }
        if(existe==true){
            System.out.println("Jugador borrado ");  
        }
        else{
            System.out.println("NO EXISTE UN JUGADOR CON ESE NOMBRE");
            System.out.println("¿Desea intentar de nuevo?: S/s      N/n");
            String opcion = in.next();
            if(opcion.equals("S") || opcion.equals("s")){
                this.borrarJugador();
            }
        }                                     
    }
    
    public void agregarJugador(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nLos jugadores inscritos en este equipo son: ");
        for(int i=0; i<5; i++){   
            System.out.println( i+1 +") "+jugadores[i].getNombreJugador()+ " " + jugadores[i].getApellidoJugador());
        }
        System.out.println("Indique la posicion en la que desa inscribir (reemplazar) el jugador");
        int posicion = (in.nextInt())-1;
        if (posicion < 5){
            jugadores[posicion].setJugador();   
        }
        else{
            System.out.println("NO EXISTE ESA OPCIÓN");
            System.out.println("¿Desea intentar de nuevo?: S/s      N/n");
            String opcion = in.next();
            if(opcion.equals("S") || opcion.equals("s")){
                this.agregarJugador();
            }
        }           
    }
    
    public void partidoGanado(int golesFavor, int golesContra){
        this.partidosJugados = this.partidosJugados + 1;
        this.partidosGanados = this.partidosGanados + 1;
        this.puntos = this.puntos + 3;
        this.golesFavor = this.golesFavor + golesFavor;
        this.golesContra = this.golesContra + golesContra;
        int dif = golesFavor - golesContra;
        this.diferenciaGoles = this.diferenciaGoles + dif;
    }
    
    public void partidoPerdido(int golesFavor, int golesContra){
        this.partidosJugados = this.partidosJugados + 1;
        this.partidosPerdidos = this.partidosPerdidos + 1;
        this.golesFavor = this.golesFavor + golesFavor;
        this.golesContra = this.golesContra + golesContra;
        int dif = golesFavor - golesContra;
        this.diferenciaGoles = this.diferenciaGoles + dif;
    }
    
    public void partidoEmpatado(int goles){
        this.partidosJugados = this.partidosJugados + 1;
        this.partidosEmpatados = this.partidosEmpatados + 1;
        this.golesFavor = this.golesFavor + goles;
        this.golesContra = this.golesContra + goles;
    }
    
    public void golesJugadores(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nIndique el jugador y los goles que hizo (Nombre apellido #goles): ");        
        String nombre = in.next();
        String apellido = in.next();
        int goles = in.nextInt();
        for(int i=0; i<5; i++){
            if(jugadores[i].getNombreJugador().equals(nombre)&&jugadores[i].getApellidoJugador().equals(apellido)){
                jugadores[i].setGoles(goles);
            }
        }
    }
           
    public String getNombreEquipo(){
        return this.nombre;
    }
       
}
