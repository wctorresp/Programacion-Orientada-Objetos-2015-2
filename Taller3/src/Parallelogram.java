import java.util.*;
public class Parallelogram extends Figura {
	
	
	
	
	public Parallelogram(){
		base = 1;
		heigth= 1;
		
	}
	public Parallelogram(double with, double length){
		base = with;
		heigth= length;
	}
	public double area (){
		double area = base *heigth;
		return area;
	}
	public double perimeter (){
		double perimeter = (2*base)+(2*heigth);
		return perimeter;
	}
	public void getParameters(){
		System.out.println("\n\nBase del paralelogramo: " + this.base);
		System.out.println("Altura del paralelogramo: " + this.heigth);
		System.out.println("Perimetro del paralelogramo: " + this.perimeter());
		System.out.println("Area del paralelogramo: " + this.area());
	}

}
