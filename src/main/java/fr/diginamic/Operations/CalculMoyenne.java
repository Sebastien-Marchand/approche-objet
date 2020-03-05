package fr.diginamic.Operations;

import java.util.Arrays;

/**Class permetant de calculer une moyenne
 * @author Sébastien MARCHAND
 *
 */


public class CalculMoyenne 
{
	double[] tabCalcul;
	
	
	/**Constructeur
	 * 
	 */
	
	
	public CalculMoyenne(){
		tabCalcul = new double[0];
		
	}
	
	
	/**Methode permetant d'ajouter une valeur dans un tableau avec gestion dynamique
	 * de la taille du tableau
	 * @param nouvelleValeur
	 */
	
	
	public void ajout(double nouvelleValeur) 
	{
		double[] tabTampon = tabCalcul.clone();											//nouveau tableau temp avec copie de toute les valeurs du tableau
		tabCalcul = new double[tabCalcul.length+1];											//agrandit le tableau 
		System.arraycopy(tabTampon, 0, tabCalcul, 0, tabTampon.length);					//copie les élément du tabTemp dans tabCalcul
		tabCalcul[tabCalcul.length-1] = nouvelleValeur;									//ajoute la nouvelle valeur au tableau
	}
	
	
	/**Permet de calculer la moyenne des valeur du tableau
	 * retourne la moyenne 
	 * @return double
	 */
	
	
	public double Calcul ()
	{
		double moyenneTableau = 0;
		for(double valeurTableau : tabCalcul)
		{
			moyenneTableau += valeurTableau;
		}
		return moyenneTableau / tabCalcul.length;
	}
	
	/**
	 *Redéfinition de la méthode toString pour affiché directement la moyenne du tableau
	 */
	@Override
	public String toString() {
		return "La moyenne du tableau" + Arrays.toString(tabCalcul) + "est égale a : " + Calcul();
	}

}
