package entites;

public class AdressePostal {

	public int numeroDeRue;
	public String libelleDeLaRue;
	public int codePostal;
	public String ville;
	
	public AdressePostal()
	{
		
	}
	public AdressePostal(int numeroDeRue, String libelleDeLaRue, int codePostal, String ville)
	{
		this.numeroDeRue = numeroDeRue;
		this.libelleDeLaRue = libelleDeLaRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
