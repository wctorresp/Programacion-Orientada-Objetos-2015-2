
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taumar
 */
public class ejec {
  public static void main(String[] args){
      Proyecto pro = new Proyecto();
      Director dir = new Director();
      Miembros miem = new Miembros();
      Equipo eq= new Equipo();
      System.out.println("Digite el nombre del proyecto");
      Scanner sc= new Scanner(System.in);
      String Lec= sc.nextLine();
      pro.setNombre(Lec);
      System.out.println("Digite el nombre del director");
      String Lec2= sc.nextLine();
      dir.setNombre(Lec2);
      System.out.println("Digite la profesion del director");
      String Lec3= sc.nextLine();
      dir.setOcupacion(Lec3);
      System.out.println("Digite nombre equipo: ");
      String Lec40 = sc.nextLine();
      eq.setNombre(Lec40);
      /*System.out.println("Cuantas personas estaran en el equipo?");
      int Lec4 = sc.nextInt();
      for(int i=1;i<=Lec4;i++){*/
          
          System.out.println("Digite el nombre del miembro " );
          String Lec41 = sc.nextLine();
          miem.setNombres(Lec41);
          
          System.out.println("Digite la cedula del miembro " );
          int Lec42 = sc.nextInt();
          miem.setCedula(Lec42);
          System.out.println("Seleccione la profesion del miembro 1 " );
          System.out.println("Digite 1 para Ing Civil");
          System.out.println("Digite 2 para Ing Sistemas");
          System.out.println("Digite 3 para Ing Mecatronica");
          System.out.println("Digite 4 para Ing Derecho");
          int Lec5 = sc.nextInt();
          switch(Lec5){
              case 1:
                  Civil civ = new Civil();
                  miem.setProfesion("Ingenieria Civil");
                  System.out.println("Digite años de experiencia: ");
                  int Lec6 = sc.nextInt();
                  civ.setExperiencia(Lec6);
                  System.out.println("Digite cantidad de proyectos: ");
                  int Lec7 = sc.nextInt();
                  civ.setCan(Lec7);
                  System.out.println("Digite su especializacion: ");
                  String Lec8 = sc.nextLine();
                  civ.setEspecia(Lec8);
                      break;
              case 2:
                  Sistemas sis = new Sistemas ();
                  miem.setProfesion("Ingenieria Sistemas");
                  System.out.println("Digite cuantos software maneja: ");
                  int Lec9 = sc.nextInt();
                  sis.setCant(Lec9);
                  System.out.println("Digite nombre del software que mejor maneja: ");
                  String Lec10 = sc.nextLine();
                  sis.setSoft(Lec10);
                  System.out.println("Digite su especializacion: ");
                  String Lec11 = sc.nextLine();
                  sis.setEspecia(Lec11);
                      break;
              case 3:
                  Mecatronica meca= new Mecatronica();
                  miem.setProfesion("Mecatronica");
                  System.out.println("Cual es su edad: ");
                  int Lec900 = sc.nextInt();
                  meca.setEdad(Lec900);
                  System.out.println("Digite cantidad de proyectos trabajados: ");
                  int Lec1001 = sc.nextInt();
                  meca.setProy(Lec1001);
                  System.out.println("Digite su especializacion: ");
                  String Lec110 = sc.nextLine();
                  meca.setEspecia(Lec110);
                      break;
              case 4:
                  Derecho der = new Derecho();
                  miem.setProfesion("Derecho");
                  System.out.println("Años Experiencia: ");
                  int Lec90 = sc.nextInt();
                  der.setAnosexp(Lec90);
                  System.out.println("Digite nombre donde trabaja: ");
                  String Lec100 = sc.nextLine();
                  der.setTrab(Lec100);
                  System.out.println("Digite su especializacion: ");
                  String Lec1101 = sc.nextLine();
                  der.setEspecia(Lec1101);
                      break;
          }
          
        
          
          
          
      
      System.out.println("Nombre Proyecto: "+pro.getNombre() +" Director: " + dir.getNombre());
      System.out.println("Nombre Miembro: "+ miem.getNombres()+ " Profesion " + miem.getProfesion()+" Cedula "+miem.getCedula());
  }
}
