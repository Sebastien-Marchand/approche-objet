package fr.diginamic.Operations;

public class Operations {
	
	/**
	 * M�thode static qui permet de r�aliser un calcul de type somme ou soustraction
	 * @param a premier chiffre
	 * @param b second chiffre
	 * @param operateur d�termine le type d'op�ration
	 * @return le r�sultat de l'op�ration r�alis�e
	 * retourn null si l'op�rateur est incorrect
	 */
	public static double Calcul(double a, double b, char operateur)
	{
		if(operateur == '+')											//r�alise une somme
		{
			double resultat = a + b;
			return resultat;
		}
		else if(operateur == '-')										//r�alise une soustraction
		{
			double resultat = a - b;
			return resultat;
		}
		else if(operateur == '/')										//r�alise une division
		{
			double resultat = a / b;
			return resultat;
		}
		else if(operateur == '*')										//r�alise une multiplication
		{
			double resultat = a * b;
			return resultat;
		}
		return (Double) null;
	}
	
	

}
