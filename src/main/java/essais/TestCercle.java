package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		double rayon[] =  {15 , 10};
		Cercle tabCercle[] = new Cercle[2];
		
		for(int i = 0 ; i <2 ; i++) {
			tabCercle[i] = CercleFactory.NewCercle(rayon[i]);
			System.out.println("Perimetre du cercle "+i+" : "+tabCercle[i].CalculPerimetre()
					+"\n Surface du cercle "+i+" : "+tabCercle[i].CalculSurface());
		}
	}

}
