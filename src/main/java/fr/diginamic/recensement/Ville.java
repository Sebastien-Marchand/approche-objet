package fr.diginamic.recensement;

public class Ville {
	int codeRegion;
	String nomRegion;
	String codeDepartement;
	int codeCommune;
	String nomCommune;
	int populationTotal;
	
	/**Constructeur
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotal
	 */
	public Ville(int codeRegion , String nomRegion , String codeDepartement , int codeCommune , String nomCommune , int populationTotal){
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotal = populationTotal;		
	}
	

	/**Getter
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**Getter
	 * @return the codeCommune
	 */
	public int getCodeCommune() {
		return codeCommune;
	}

	/**Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**Getter
	 * @return the populationTotal
	 */
	public int getPopulationTotal() {
		return populationTotal;
	}
	
	@Override
	public
	String toString()
	{
		String information = "Code region : " + getCodeRegion() + "\tNom de la Région :" + getNomRegion() + "\nCode département : " + getCodeDepartement() + "\nCode commune : "
				+ getCodeCommune() + "\nNom de la commune : " + getNomCommune() + "\nPopulation total : " + getPopulationTotal() + " Habitants";
		return information;
	}
	

}
