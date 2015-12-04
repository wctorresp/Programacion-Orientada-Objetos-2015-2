
public class Rectangle extends Parallelogram{

	public Rectangle(){
		base = 1;
		heigth= 1;
	}
	public Rectangle(double with, double length){
		base = with;
		heigth= length;
	}
	public void getParameters(){
		System.out.println("\n\nAncho del rectangulo: " + this.base);
		System.out.println("Largo del rectangulo: " + this.heigth);
		System.out.println("Perimetro del rectangulo: " + this.perimeter());
		System.out.println("Area del rectangulo: " + this.area());
	}
}
