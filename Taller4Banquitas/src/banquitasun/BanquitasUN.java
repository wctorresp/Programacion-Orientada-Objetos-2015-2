package banquitasun;

import java.util.*;

/**
 * @author Camilo Torres
 */
public class BanquitasUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Banquitas UN");
        Torneo banquitasUN = new Torneo();
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while (run == true){
            System.out.println("\n1) Inscribir equipo");
            System.out.println("2) Despedir equipo");
            System.out.println("3) Despedir jugador");
            System.out.println("4) Salir");
            System.out.print("Indique el numero de la operacion que desea realizar: ");
            int opcion = in.nextInt();
            if(opcion == 1){
            banquitasUN.inscribirEquipo();
            }
            else if(opcion == 2){
            banquitasUN.despedirEquipo();
            }
            else if(opcion == 3){
            banquitasUN.despedirJugador();
            }
            else if(opcion == 4){
            run=false;
            }
            else{
            System.out.println("Opcion invalida");
            }
        }
              
    }
    
}
