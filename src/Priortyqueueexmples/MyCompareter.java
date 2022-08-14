package Priortyqueueexmples;

import java.util.Comparator;

public class MyCompareter implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;//or//String s1 = o1.toString(
		
		String s2 = (String) o2;//or// String s2 = o2.toString(
		return s2.compareTo(s1);
	}

}
