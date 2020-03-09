package essais;

import inter_face.Cercle;
import inter_face.ObjetGeometrique;
import inter_face.Rectangle;

public class TestObjetGeometrique {
	
	
	public static void main(String args[]) {
		
		ObjetGeometrique tabObjGeo[] = new ObjetGeometrique[2];
		
		tabObjGeo[0] = new Cercle();
		tabObjGeo[1] = new Rectangle();
		
		for(ObjetGeometrique objGeo : tabObjGeo)
		{
			System.out.println(objGeo.surface());
			System.out.println(objGeo.perimetre());
		}
	}
}
