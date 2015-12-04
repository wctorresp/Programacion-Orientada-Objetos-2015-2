
public class IsocelesTriangle extends Triangle{
	
	public IsocelesTriangle(){
		this.base = 1;
		this.heigth = 1;
	}
	
	public IsocelesTriangle(double base, double heigth){
		this.base = base;
		this.heigth = heigth;
	}
	public double perimeter (){
		double perimeter = base + ((Math.sqrt(Math.pow(base, 2)+Math.pow(heigth, 2)))*2);
		return perimeter;
	}
	public void getParameters(){
		System.out.println("\n\nBase del triangulo isiceles: " + this.base);
		System.out.println("Altura del triangulo isoceles: " + this.heigth);
		System.out.println("Perimetro del triangulo isoceles: " + this.perimeter());
		System.out.println("Area del triangulo isoceles: " + this.area());
	}
}
