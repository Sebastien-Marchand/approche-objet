package utils;

import entites.Cercle;

public class CercleFactory{

	/**
	 * @param rayon
	 * @return Cercle
	 */
	public static Cercle NewCercle( double rayon) {
		Cercle nouveauCercle = new Cercle(rayon);
		return nouveauCercle;
	}
}
