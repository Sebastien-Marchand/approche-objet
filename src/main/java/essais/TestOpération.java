package essais;

import fr.diginamic.Operations.Operations;

public class TestOp�ration {

	public static void main(String[] args) {
		char tabTypeOp�ration[] = {'+','-','/','*'};

		for ( int i = 0 ; i < 4 ; i++) {
			System.out.println(Operations.Calcul(5, 10, tabTypeOp�ration[i]));
		}
	}
}
