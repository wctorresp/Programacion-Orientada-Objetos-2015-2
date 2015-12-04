/**
 * @(#)EmpleadoTest.java
 *
 *
 * @author 
 * @version 1.00 2015/10/10
 */


public class EmpleadoTest{
	static Empleado nuev1= new Empleado("Jose","Perez",250.00);
	static Empleado nuev2= new Empleado("Joselito","Ochoa",100);
	static Empleado nuev3= new Empleado("Pepito","Perez",290);
	static Empleado nuev4= new Empleado("Andres","Romero",3500);
	static Empleado nuev5= new Empleado("Darwin","Vanegas",1200);
    public EmpleadoTest() {
    }
    public static void main (String args[]) {
    	System.out.println("Empleado 1; " + nuev1.nombre() +" " +nuev1.apellido()+" "+nuev1.salario()+" Salario con incremento 5 años: "+nuev1.incremento());
    	System.out.println("Empleado 2; " + nuev2.nombre() +" " +nuev2.apellido()+" "+nuev2.salario()+" Salario con incremento 5 años: "+nuev2.incremento());
    	System.out.println("Empleado 3; " + nuev3.nombre() +" " +nuev3.apellido()+" "+nuev3.salario()+" Salario con incremento 5 años: "+nuev3.incremento());
    	System.out.println("Empleado 4; " + nuev4.nombre() +" " +nuev4.apellido()+" "+nuev4.salario()+" Salario con incremento 5 años: "+nuev4.incremento());
    	System.out.println("Empleado 5; " + nuev5.nombre() +" " +nuev5.apellido()+" "+nuev5.salario()+" Salario con incremento 5 años: "+nuev5.incremento());
    	
    }
    
    
}