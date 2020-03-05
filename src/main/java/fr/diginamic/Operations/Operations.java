package fr.diginamic.Operations;

public class Operations {
	
	/**
	 * Méthode static qui permet de réaliser un calcul de type somme ou soustraction
	 * @param a premier chiffre
	 * @param b second chiffre
	 * @param operateur détermine le type d'opération
	 * @return le résultat de l'opération réalisée
	 * retourn null si l'opérateur est incorrect
	 */
	public static double Calcul(double a, double b, char operateur)
	{
		if(operateur == '+')											//réalise une somme
		{
			double resultat = a + b;
			return resultat;
		}
		else if(operateur == '-')										//réalise une soustraction
		{
			double resultat = a - b;
			return resultat;
		}
		else if(operateur == '/')										//réalise une division
		{
			double resultat = a / b;
			return resultat;
		}
		else if(operateur == '*')										//réalise une multiplication
		{
			double resultat = a * b;
			return resultat;
		}
		return (Double) null;
	}
	
	

}
