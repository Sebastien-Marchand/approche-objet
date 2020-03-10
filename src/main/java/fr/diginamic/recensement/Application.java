package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args){
		File file = new File("C:\\Users\\atlantis\\eclipse-workspace\\approche-objet\\src\\main\\resources\\recensement population 2016.csv");
		
		try {
			
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);
			ArrayList<Ville> villes = new ArrayList<Ville>();
			
			for(String ligne : lignes)
			{
				String[] morceaux = ligne.split(";");
				Ville nouvelleVille = new Ville(Integer.parseInt(morceaux[0]) , morceaux[1] , morceaux[2] , Integer.parseInt(morceaux[5].replace(" ", "")) , morceaux[6] , Integer.parseInt(morceaux[9].replace(" ", "")));
				villes.add(nouvelleVille);
			}
			
			System.out.println("Nombre de ville disponible dans la liste: " + villes.size() + "\n");
			
			
			System.out.println(FoundInformationVille(villes , "Montpellier")+ "\n");
			System.out.println("nombre total d'habitant dans l'hérault : " + FoundTotalHabDept(villes,"34")+ "\n");
			System.out.println("Ville avec le nb d'habitant le plus faible : \n" + FoundMinHabDept(villes,"34") + "\n");
			
			System.out.println("\n\n---------Villes les plus grande du département :\n\n");
			System.out.println(Found10MaxHabDept(villes,"34"));
			System.out.println("\n\n---------Les 10 villes les moins peuplé sont :\n\n");
			System.out.println( Found10MinHabDept(villes,"34"));
			
			System.out.println("Habitant total région occitanie : " + FoundTotalHabReg(villes , 76));
			
			System.out.println("\n\n---------Villes les plus grande de l'occitanie :\n\n");
			System.out.println(Found10MaxHabReg(villes,76));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * Permet de trouver les 10 ville avec le plus d'habitant dans une région
	 * @param listeVille représente la liste de ville a parcourir
	 * @param codeReg représente le code départemental
	 * @return ArrayList<Ville> liste de Ville
	 */
	public static ArrayList<Ville> Found10MaxHabReg (ArrayList<Ville> listeVille, int codeReg)
	{
		ArrayList<Ville> les10VilleMax = new ArrayList<Ville>();
		
		for(Ville laVille : listeVille)											//Pour chaque ville de la liste
		{
			if(laVille.getCodeRegion() == codeReg)
			{
				if(les10VilleMax.size() < 10)										//si on ne détient pas 10 villes
				{
					les10VilleMax.add(laVille);										//ajoute une ville
				}
				else
				{
					Ville laVilleFaibleDes10 = null;
					for(Ville laVillemax : les10VilleMax)							//compare la ville avec les 10 trouvé
					{
						if(laVilleFaibleDes10 == null)								//si aucune ville min
						{
							laVilleFaibleDes10 = laVillemax;
						}
						else
						{
							if(laVillemax.getPopulationTotal() < laVilleFaibleDes10.getPopulationTotal())
							{
								laVilleFaibleDes10 = laVillemax;
							}
						}
					}
					
					if (laVilleFaibleDes10.getPopulationTotal() < laVille.getPopulationTotal())		//si la ville parcouru est supérieur a la plus petit des 10
					{
						les10VilleMax.remove(laVilleFaibleDes10);
						les10VilleMax.add(laVille);
					}
				}
			}
		}
		return les10VilleMax;
	}
	
	/**
	 * Permet de trouver les 10 ville avec le moins d'habitant dans un département
	 * @param listeVille représente la liste de ville a parcourir
	 * @param codeDept représente le code départemental
	 * @return ArrayList<Ville> liste de Ville
	 */
	public static ArrayList<Ville> Found10MinHabDept (ArrayList<Ville> listeVille, String codeDept)
	{
		ArrayList<Ville> les10VilleMin = new ArrayList<Ville>();
		
		for(Ville laVille : listeVille)											//Pour chaque ville de la liste
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				if(les10VilleMin.size() < 10)										//si on ne détient pas 10 villes
				{
					les10VilleMin.add(laVille);										//ajoute une ville
				}
				else
				{
					Ville laVilleHauteDes10 = null;
					for(Ville laVillemin : les10VilleMin)							//compare la ville avec les 10 trouvé
					{
						if(laVilleHauteDes10 == null)								//si aucune ville max
						{
							laVilleHauteDes10 = laVillemin;
						}
						else
						{
							if(laVillemin.getPopulationTotal() > laVilleHauteDes10.getPopulationTotal())
							{
								laVilleHauteDes10 = laVillemin;
							}
						}
					}
					
					if (laVilleHauteDes10.getPopulationTotal() > laVille.getPopulationTotal())		//si la ville parcouru est supérieur a la plus petit des 10
					{
						les10VilleMin.remove(laVilleHauteDes10);
						les10VilleMin.add(laVille);
					}
				}
			}
		}
		return les10VilleMin;
	}
	
	/**
	 * Permet de trouver les 10 ville avec le plus d'habitant dans un département
	 * @param listeVille représente la liste de ville a parcourir
	 * @param codeDept représente le code départemental
	 * @return ArrayList<Ville> liste de Ville
	 */
	public static ArrayList<Ville> Found10MaxHabDept (ArrayList<Ville> listeVille, String codeDept)
	{
		ArrayList<Ville> les10VilleMax = new ArrayList<Ville>();
		
		for(Ville laVille : listeVille)											//Pour chaque ville de la liste
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				if(les10VilleMax.size() < 10)										//si on ne détient pas 10 villes
				{
					les10VilleMax.add(laVille);										//ajoute une ville
				}
				else
				{
					Ville laVilleFaibleDes10 = null;
					for(Ville laVillemax : les10VilleMax)							//compare la ville avec les 10 trouvé
					{
						if(laVilleFaibleDes10 == null)								//si aucune ville min
						{
							laVilleFaibleDes10 = laVillemax;
						}
						else
						{
							if(laVillemax.getPopulationTotal() < laVilleFaibleDes10.getPopulationTotal())
							{
								laVilleFaibleDes10 = laVillemax;
							}
						}
					}
					
					if (laVilleFaibleDes10.getPopulationTotal() < laVille.getPopulationTotal())		//si la ville parcouru est supérieur a la plus petit des 10
					{
						les10VilleMax.remove(laVilleFaibleDes10);
						les10VilleMax.add(laVille);
					}
				}
			}
		}
		return les10VilleMax;
	}
	
	/**
	 * @param listeVille représente la liste de ville a parcourir
	 * @param codeDept représente le code départemental
	 * @return oject qui represente une ville
	 */
	public static Ville FoundMinHabDept(ArrayList<Ville> listeVille, String codeDept)
	{
		Ville villeMin  = listeVille.get(0);
		
		for(Ville laVille : listeVille)
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				if(laVille.getPopulationTotal() < villeMin.getPopulationTotal())
				{
					villeMin = laVille;
				}
			}
		}
		return villeMin;
	}
	/**
	 * Permet de calculer le nombre total d'habitant dans une région
	 * @param listeVille représente la liste de ville a parcourir
	 * @param codeReg représente le code départemental
	 * @return int le nombre total d'habitant du département
	 * @return 0 aucun département ne correspond
	 */
	public static int FoundTotalHabReg(ArrayList<Ville> listeVille, int codeReg)
	{
		int totalHabReg = 0;				//code region 34

		for(Ville laVille : listeVille)
		{
			if(laVille.getCodeRegion() == codeReg)
			{
				totalHabReg += laVille.getPopulationTotal();
			}
		}
		return totalHabReg;
	}
	
	/**
	 * Permet de calculer le nombre total d'habitant dans un département
	 * 
	 * @param listeVille représente la liste de ville a parcourir
	 * @param codeDept représente le code départemental
	 * @return int le nombre total d'habitant du département
	 * @return 0 aucun département ne correspond
	 */
	public static int FoundTotalHabDept(ArrayList<Ville> listeVille, String codeDept)
	{
		int totalHabHerault = 0;				//code region 34

		for(Ville laVille : listeVille)
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				totalHabHerault += laVille.getPopulationTotal();
			}
		}
		return totalHabHerault;
	}
	/**
	 * Permet de trouver les information d'une ville précise
	 * 
	 * @param listeVille représente la liste de ville a parcourir
	 * @param ville représente le nom de la ville recherché
	 * @return Ville oject qui represente une ville
	 * @return null si aucun élement ne correspond
	 */
	public static Ville FoundInformationVille (ArrayList<Ville> listeVille , String ville )
	{
		Ville villeTrouver = null;
		for(Ville laVille : listeVille)
		{
			if(laVille.getNomCommune().contentEquals(ville))
			{
				villeTrouver = laVille;
			}
		}
		return villeTrouver ;
	}

}
