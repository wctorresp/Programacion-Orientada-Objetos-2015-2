
public class Empleado {
	public String nombre;
	public String apellido;
	public double salario = 0;
    public Empleado(String nom,String apel,double sal) {
    	this.nombre=nom;
    	this.apellido=apel;
    	this.salario=sal;
    }
	public  String  nombre(){
		return nombre;
	}
	public String apellido(){
		return apellido;
	}
	public double  salario(){
		return salario;
	}

    public double incremento(){
    	double incre=0;
    	if(salario<0){
    		System.out.println("El salario no puede tener valor negativo");	
    	}
    	double salarionuevo=salario;
    	for(int i=0;i<5;i++){	
    		incre=salarionuevo * 0.1;
    		salarionuevo=salarionuevo + incre;
    	}
    	
    	return salarionuevo;
    }
    
}