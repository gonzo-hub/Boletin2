
public class Circulo {

	
	double radio;
	
	public Circulo(double radio) {
		
		this.radio = radio;
		
		double areaCirculo = radio * radio * Math.PI;
		
		System.out.println (areaCirculo);
	}
}
