
public class Rombo {

	double diagonalMayor;
	double diagonalMenor;
	
	public Rombo(double diagonalMayor, double diagonalMenor) {
		
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
		
		double areaRombo = diagonalMayor * diagonalMenor / 2;
		
		System.out.println(areaRombo);	
	}
	
}
