package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	int jourTravailler;
	double montantJournalierRemuneration;
	
	public Pigiste(String nom, String prenom, int jourTravailler, double montantJournalierRemuneration) {
		super(nom, prenom);
		this.jourTravailler = jourTravailler;
		this.montantJournalierRemuneration = montantJournalierRemuneration;
		
	}
	
	public double GetSalaire()
	{
		return this.jourTravailler * this.montantJournalierRemuneration;
	}
	public String GetStatue()
	{
		return this.getClass().getSimpleName();
	}
}
