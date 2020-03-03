package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		String monString = "150";
		int monNombre = Integer.decode(monString);									//décode un string et retourne un int
		int monNombreSup = 250;
		System.out.println(monNombre);
		System.out.println(Integer.max(monNombreSup, monNombre));					//affiche le chiffre le plus grand e comparant les deux
	}

}
