package tri;


/**
 * @author Sébastien MARCHAND
 *Class qui représente un pays
 */
public class Pays implements Comparable<Pays>{
	
	String nom;
	double nbHabitant;
	double pib_par_Habitant;

	public Pays(String nom, double nbHabitant, double pib_par_Habitant)
	{
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pib_par_Habitant = pib_par_Habitant;
	}
	
	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Getter
	 * @return the nbHabitant
	 */
	public double getNbHabitant() {
		return nbHabitant;
	}

	/**Getter
	 * @return the pib_par_Habitant
	 */
	public double getPib_par_Habitant() {
		return pib_par_Habitant;
	}

	@Override
	public int compareTo(Pays pays2) {
		int result = this.nom.compareTo(pays2.getNom());
		
		return result;
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(!(object instanceof Pays))
		{
			return false;
		}
		Pays other = (Pays) object;
		return this.nom.equals(other.getNom());
	}
}
