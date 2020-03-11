package tri;

import java.util.Comparator;

public class PaysComparator implements Comparator<Pays>{

	/**
	 *Compare le nombre d'habitant des pays
	 */
	@Override
	public int compare(Pays pays1, Pays pays2) {

		return (int) ((int)pays2.getPib_par_Habitant() - pays1.getPib_par_Habitant());
	}

}
