package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	private double montantSalaireMensuel;

	public Salarie(String nom, String prenom, double montantSalaireMensuel) {
		super(nom, prenom);
		this.montantSalaireMensuel = montantSalaireMensuel;
	}
	
	public double GetSalaire() {

		return montantSalaireMensuel;
	}


	public String GetStatue()
	{
		return this.getClass().getSimpleName();
	}
	
}
