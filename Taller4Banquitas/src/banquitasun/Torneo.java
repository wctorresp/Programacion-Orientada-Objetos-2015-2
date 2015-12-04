package banquitasun;

import java.util.*;

/**
 * @author Camilo Torres
 */
public class Torneo {
    
    
    Equipo equipos[]= new Equipo[8]; 
    
    public Torneo(){
        for(int i=0; i<8; i++){
            this.equipos[i]= new Equipo();
        }        
    }
    
    public void mostrarEquipos(){
        System.out.println("\nLos equipos inscritos son: ");
        for (int i = 0; i < 8; i++) {
            if (equipos[i].getNombreEquipo() == null) {
            } else {
                System.out.println(equipos[i].getNombreEquipo());
            }
        }
    }
             
    public void inscribirEquipo(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nIngrese el nombre del equipo: "); 
        String nombre= in.next();  
        for(int j=0; j<8; j++){
            if(equipos[j].getNombreEquipo() == null){
                equipos[j] = new Equipo();
                equipos[j].setEquipo(nombre);
                j=8;
            }
            else if(equipos[j].getNombreEquipo().equals(nombre)){
                System.out.println("YA EXISTE UN EQUIPO CON ESE NOMBRE");
                System.out.println("¿Desea intentar de nuevo?: S/s      N/n");
                String opcion = in.next();
                if(opcion.equals("S") || opcion.equals("s")){
                    this.inscribirEquipo();
                }
                else{
                    j=8;
                }
            }                
        }                           
    }
    
    public void inscrivirJugador(){
        Scanner in = new Scanner(System.in);
        this.mostrarEquipos();
            
        System.out.print("\nIngrese el nombre del equipo en el que va a inscribir el jugador: ");
        String nombreEquipo= in.next(); 
        boolean existe = false;
        for(int i=0; i<8; i++){
            if (equipos[i].getNombreEquipo()==null){}
            else if(equipos[i].getNombreEquipo().equals(nombreEquipo)){
                equipos[i].agregarJugador();
                Runtime.getRuntime().gc();
                existe=true;
            } 
        }
        if(existe==true){
            System.out.println("Jugador Inscrito ");  
        }
        else{
            System.out.println("NO EXISTE UN EQUIPO CON ESE NOMBRE");
            System.out.println("¿Desea intentar de nuevo?: S/s      N/n");
            String opcion = in.next();
            if(opcion.equals("S") || opcion.equals("s")){
                this.despedirEquipo();
            }
        }
    
    }
    
    public void despedirEquipo(){
        Scanner in = new Scanner(System.in);
        this.mostrarEquipos();            
        System.out.print("\nIndique el nombre del equipo que desea eliminar: ");
        String nombreEquipo= in.next(); 
        boolean existe = false;
        for(int i=0; i<8; i++){
            if (equipos[i].getNombreEquipo()==null){}
            else if(equipos[i].getNombreEquipo().equals(nombreEquipo)){
                equipos[i] = null;
                equipos[i] = new Equipo(); 
                Runtime.getRuntime().gc();
                existe=true;
            } 
        }
        if(existe==true){
            System.out.println("Equipo borrado ");  
        }
        else{
            System.out.println("NO EXISTE UN EQUIPO CON ESE NOMBRE");
            System.out.println("¿Desea intentar de nuevo?: S/s      N/n");
            String opcion = in.next();
            if(opcion.equals("S") || opcion.equals("s")){
                this.despedirEquipo();
            }
        }
    }
    
    public void despedirJugador(){
        Scanner in = new Scanner(System.in);
        this.mostrarEquipos();
        System.out.print("\nIndique el nombre del equipo del jugador que desea eliminar: "); 
        String nombreEquipo= in.next();  
        for(int i=0; i<8; i++){
            if(equipos[i].getNombreEquipo().equals(nombreEquipo)){                
                equipos[i].borrarJugador();
                i=8;
            }
            else {
                System.out.println("NO EXISTE UN EQUIPO CON ESE NOMBRE");
                System.out.println("¿Desea intentar de nuevo?: S/s      N/n");
                String opcion = in.next();
                if(opcion.equals("S") || opcion.equals("s")){
                this.despedirJugador();
                }
                else{
                    i=8;
                }
            }
        }
    }
    
    public void agregarPartido(){
        Scanner in = new Scanner(System.in);
        this.mostrarEquipos();
        System.out.println("\n INGRESE LOS EQUIPOS QUE JUGARON EL PARTIDO: ");
        String equipo1 = in.next();
        String equipo2 = in.next();
        System.out.println("Goles realizados por el primer y segundo equipo respectivamente: ");
        int golesEquipo1 = in.nextInt();
        int golesEquipo2 = in.nextInt();
        
    }
    
    public void calculoPuntos( String equipo1, String equipo2, int golesEquipo1, int golesEquipo2){
        if (golesEquipo1 > golesEquipo2){
            for(int i=0; i<8; i++){
                if(equipos[i].getNombreEquipo().equals(equipo1)){
                    equipos[i].partidoGanado(golesEquipo1, golesEquipo2);
                    if(golesEquipo1>0){
                        equipos[i].golesJugadores();
                    }                    
                    i=8;
                }                
            }
            for(int i=0; i<8; i++){
                if(equipos[i].getNombreEquipo().equals(equipo2)){
                    equipos[i].partidoPerdido(golesEquipo2, golesEquipo1);
                    i=8;
                }                
            }
        }
        if (golesEquipo2 > golesEquipo1){
            for(int i=0; i<8; i++){
                if(equipos[i].getNombreEquipo().equals(equipo2)){
                    equipos[i].partidoGanado(golesEquipo2, golesEquipo1);
                    i=8;
                }                
            }
            for(int i=0; i<8; i++){
                if(equipos[i].getNombreEquipo().equals(equipo1)){
                    equipos[i].partidoPerdido(golesEquipo1, golesEquipo2);
                    i=8;
                }                
            }
        }
        if (golesEquipo1 == golesEquipo2){
            for(int i=0; i<8; i++){
                if(equipos[i].getNombreEquipo().equals(equipo1)){
                    equipos[i].partidoEmpatado(golesEquipo1);
                    i=8;
                }                
            }
            for(int i=0; i<8; i++){
                if(equipos[i].getNombreEquipo().equals(equipo2)){
                    equipos[i].partidoEmpatado(golesEquipo1);
                    i=8;
                }                
            }
        }
    }
              
}
