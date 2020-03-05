package essais;

import fr.diginamic.Operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calcul1 = new CalculMoyenne();
		CalculMoyenne calcul2 = new CalculMoyenne();
		double[] valeurAjout1 = {1.0 , 150 , 860.95 , 3 };
		double[] valeurAjout2 = {2.0 , 300 , 460.95 , 6 };

		for (int i = 0 ; i < valeurAjout1.length ; i++)
		{
			calcul1.ajout(valeurAjout1[i]);
		}
		
		System.out.println(calcul1);
		
		for (int i = 0 ; i < valeurAjout2.length ; i++)
		{
			calcul2.ajout(valeurAjout2[i]);
		}
		
		System.out.println(calcul2);
		
	}

}
