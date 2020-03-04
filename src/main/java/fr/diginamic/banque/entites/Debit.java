package fr.diginamic.banque.entites;

public class Debit extends Operation{

	int debitCompte;
	public Debit(String date, float montant) {
		super(date, montant);
		
	}
	
	public String afficherType()
	{
		return "Débit";
	}

}
