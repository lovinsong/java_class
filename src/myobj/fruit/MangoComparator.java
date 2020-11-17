package myobj.fruit;

import java.util.Comparator;

public class MangoComparator implements Comparator<Mango> {

	@Override
	public int compare(Mango this_Mango, Mango next_Mango) {
		if (this_Mango.calorie > next_Mango.calorie) {
			return 1;
		} else if (this_Mango.calorie < next_Mango.calorie) {
			return -1;
		} else {
			if (this_Mango.sweet > next_Mango.sweet) {
				return 1;
			} else if (this_Mango.sweet < next_Mango.sweet) {
				return -1;
			} else {
				return 0;
			}

		}
	}
}
