package fr.diginamic.banque.entites;

import java.util.Date;

public abstract class  Operation {

	String maDateDoperation ;
	float montantDeLoperation;
	
	public Operation(String date, float montant)
	{
		maDateDoperation = date;
		montantDeLoperation = montant;
	}
	public abstract String afficherType();
}

