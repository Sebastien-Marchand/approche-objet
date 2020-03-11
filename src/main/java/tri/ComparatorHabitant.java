package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays>{

	/**
	 *Compare le nombre d'habitant des pays
	 */
	@Override
	public int compare(Pays pays1, Pays pays2) {

		return (int) (pays2.getNbHabitant() - pays1.getNbHabitant());
	}

	
}
