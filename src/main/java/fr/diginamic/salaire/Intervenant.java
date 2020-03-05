package fr.diginamic.salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	
	public abstract double GetSalaire();
	public abstract String GetStatue();
	
	public Intervenant(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}

	public  String afficherDonnees()
	{
		return this.GetStatue() + " " + this.nom + " " + this.prenom + " Salaire : " + this.GetSalaire();
	}
}
