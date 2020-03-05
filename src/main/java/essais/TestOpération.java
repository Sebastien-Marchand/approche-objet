package essais;

import fr.diginamic.Operations.Operations;

public class TestOpération {

	public static void main(String[] args) {
		char tabTypeOpération[] = {'+','-','/','*'};

		for ( int i = 0 ; i < 4 ; i++) {
			System.out.println(Operations.Calcul(5, 10, tabTypeOpération[i]));
		}
	}
}
