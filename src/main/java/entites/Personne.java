package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostal adressePostal = new AdressePostal();
	
	public Personne(String nom, String prenom)																			//Constructeur nom et prenom
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public Personne(String nom, String prenom, int numeroDeRue, String libelleDeLaRue, int codePostal, String ville)		//constructeur complet
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostal = new AdressePostal(numeroDeRue, libelleDeLaRue, codePostal, ville);
		
	}

}
