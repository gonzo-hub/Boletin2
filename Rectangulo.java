
public class Rectangulo {
	
	double lado1;
	double lado2;
	
	public Rectangulo(double lado1, double lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		
		double areaRectangulo = lado1 * lado2;
		
		System.out.println(areaRectangulo);
	}

}
