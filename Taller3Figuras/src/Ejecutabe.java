import java.util.*;
public class Ejecutabe {

	public static void main(String[] args) {
		
		ArrayList<Figura>figuras = new ArrayList<Figura>();
		figuras.add(new Parallelogram());
		figuras.add(new Parallelogram(2,3));
		figuras.add(new Rectangle());
		figuras.add(new Rectangle(5,4));
		figuras.add(new Triangle());
		figuras.add(new Triangle(2,Math.sqrt(3),2,2));
		figuras.add(new IsocelesTriangle());
		figuras.add(new IsocelesTriangle(2,1));		
		
		figuras.get(0).getParameters();
		figuras.get(1).getParameters();
		figuras.get(2).getParameters();
		figuras.get(3).getParameters();
		figuras.get(4).getParameters();
		figuras.get(5).getParameters();
		figuras.get(6).getParameters();
		figuras.get(7).getParameters();
		
	}

}
