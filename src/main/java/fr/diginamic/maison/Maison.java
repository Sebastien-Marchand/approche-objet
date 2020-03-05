package fr.diginamic.maison;

public class Maison {
	Piece[] lesPiecesDeLaMaison = new Piece[0];
	
	/**
	 * Permet d'ajouter une pièce a la maison
	 * la taille du tableau en attribut de la casse augmente de un
	 * place la référence de l'objet piece dans le tableau
	 * @param piece
	 */
	
	
	public void AjouterPiece(Piece piece)
	{
		if(piece != null && piece.etage >= 0 && piece.superficie > 0)
		{
			Piece[] tabTemp = lesPiecesDeLaMaison.clone();									//augmente la taille du tableau
			lesPiecesDeLaMaison = new Piece[tabTemp.length+1];
			System.arraycopy(tabTemp, 0, lesPiecesDeLaMaison, 0, tabTemp.length);
			
			lesPiecesDeLaMaison[lesPiecesDeLaMaison.length-1] = piece;						//ajoute la pièce au tableau
		}
	}
	
	
	/**
	 * Calcule la superficie total de la maison
	 * 
	 * @return double la superficie
	 */
	
	public double GetSuperficieTotal()
	{
		double superficieTotal = 0;
		for(Piece laPiece : lesPiecesDeLaMaison)
		{
			superficieTotal += laPiece.superficie;
		}
		return superficieTotal;
	}
	
	
	/**
	 * Calcul et retourn la superficie total par étage
	 * @param etage L'étage que l'on souhaite calculer
	 * @return double superficie total
	 * 
	 */
	
	public double GetSuperficieEtage(int etage)
	{
		double superficieTotal = 0;
		for(Piece laPiece : lesPiecesDeLaMaison)
		{
			if ( laPiece.etage == etage)
			{
				superficieTotal += laPiece.superficie;
			}
		}
		return superficieTotal;
	}
	
	/**
	 * @param Type
	 * 0 pour Chambre
	 * 1 pour Cuisine
	 * 2 pour Salon
	 * 3 pour SalleDeBainain
	 * 4 pour WC
	 * @return
	 */
	public double GetSuperficieType(int Type)
	{
		double superficieTotal = 0;
		for(Piece laPiece : lesPiecesDeLaMaison)
		{
			if ( laPiece.type == Type)
			{
				superficieTotal += laPiece.superficie;
			}
		}
		return superficieTotal;
	}

}
