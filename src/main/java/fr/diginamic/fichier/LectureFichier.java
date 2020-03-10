package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) {
			File file = new File("C:\\Users\\atlantis\\eclipse-workspace\\approche-objet\\src\\main\\resources\\recensement population 2016.csv");
			try {
				List<String> lignes = FileUtils.readLines(file, "UTF-8");
				System.out.println(lignes.get(0));
				String ligne = lignes.get(0);
				String[] morceaux = ligne.split(";");
				System.out.println(morceaux[0]);
				
				for (String laLigne : lignes)
				{
					System.out.println(laLigne);
				}
				System.out.println("Nombre de ligne : " + lignes.size());
				
			} catch (IOException e) {

				e.printStackTrace();
			}

	}
}
