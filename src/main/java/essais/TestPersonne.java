package essais;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
	/*	Personne monPersonnage = new Personne("Malacoff", "joseph");
		monPersonnage.adressePostal.numeroDeRue = 13;
		monPersonnage.adressePostal.libelleDeLaRue = "rue de la poisse";
		monPersonnage.adressePostal.codePostal = 62860;
		monPersonnage.adressePostal.ville = "Marseille";*/
		
		Personne monPersonnage2 = new Personne("paloudouli" , "Yen-gi" , 69 , "avenue du general du BBQ", 92850 ,"Bordeaux" );
																											//Le nombre de ligne nécessaire a l'instanciation
																											//est bien inférieur avec le constructeur complet
		System.out.println("Monsieur :"+monPersonnage2.GetNom()+" "+monPersonnage2.GetPrenom()+ "\nvie a l'adresse : " + monPersonnage2.GetAdresse());
		monPersonnage2.ChangerAdresse(45, "Rue des coquelicot", 58500, "Nantes");
		System.out.println("Monsieur :"+monPersonnage2.GetNom()+" "+monPersonnage2.GetPrenom()+ "\nvie a l'adresse : " + monPersonnage2.GetAdresse());
		
	}

}
