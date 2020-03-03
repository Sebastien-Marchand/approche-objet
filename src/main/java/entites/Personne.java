package entites;

public class Personne {
	private String nom;
	private String prenom;
	private AdressePostal adressePostal = new AdressePostal();
	
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
	public String GetNom()
	{
		return this.nom.toUpperCase();
	}
	
	public String GetPrenom()
	{
		return this.prenom;
	}
	public String GetAdresse() {
		String monAdresse = this.adressePostal.numeroDeRue +" " + this.adressePostal.libelleDeLaRue +" "+this.adressePostal.codePostal+" "+ this.adressePostal.ville;
		return monAdresse;
	}
	public boolean ChangerNom(String nom)
	{
		this.nom = nom;
		if(this.nom == nom)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean ChangerPrenom(String prenom)
	{
		this.prenom = prenom;
		if(this.prenom == prenom)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean ChangerAdresse(int numeroDeRue, String libelleDeLaRue, int codePostal, String ville)
	{
		this.adressePostal = new AdressePostal(numeroDeRue, libelleDeLaRue, codePostal, ville);
		if(this.prenom == prenom)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
