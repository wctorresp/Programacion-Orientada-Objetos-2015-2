
public class Triangle extends Figura {
	
		double base;
		double heigth;
		private double ladoA;
		private double ladoB;
		
		public Triangle(){
			this.base = 1;
			this.heigth = 1;
			this.ladoA = 1;
			this.ladoB = 1;
		}
		public Triangle(double base, double heigth, double ladoA, double ladoB){
			this.base = base;
			this.heigth = heigth;
			this.ladoA = ladoA;
			this.ladoB = ladoB;
		}
		public double area (){
			double area = (base *heigth)/2;
			return area;
		}
		public double perimeter (){
			double perimeter = base + ladoA + ladoB;
			return perimeter;
		}
		public void set(double base, double heigth, double ladoA, double ladoB){
			this.base = base;
			this.heigth = heigth;
			this.ladoA = ladoA;
			this.ladoB = ladoB;
		} 	
		public void getParameters(){
			System.out.println("\n\nBase del triangulo: " + this.base);
			System.out.println("Lado A: " + this.ladoA + " Lado B: " + this.ladoB);
			System.out.println("Altura del triangulo: " + this.heigth);
			System.out.println("Perimetro del triangulo: " + this.perimeter());
			System.out.println("Area del triangulo: " + this.area());
		}
}
