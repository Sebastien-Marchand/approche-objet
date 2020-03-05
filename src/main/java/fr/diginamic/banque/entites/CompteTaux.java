package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	/** tauxRemuneration du compte*/
	float tauxRemuneration = 0f;
	
	/**Constructeur par defaut
	 * @param numeroCompte
	 * @param soldeCompte
	 */
	public CompteTaux(int numeroCompte, double soldeCompte, float tauxRemuneration)
	{
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 *Red�finition de la methode toString() de java.lang
	 *Permet de retourner les information plutot que l'adresse de l'objet.
	 */
	@Override
	
	public String toString()
	{
		String information = "Numero du compte: " +numeroCompte +" Solde: "+ soldeCompte + "Taux de r�muneration du compte : "+tauxRemuneration;
		return information;
	}

	
	
}
