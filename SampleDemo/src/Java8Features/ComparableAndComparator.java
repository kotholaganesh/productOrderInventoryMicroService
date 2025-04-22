package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Gani");
		names.add("Ram");
		names.add("Abhu");
		names.add("Jena");
		names.add("Durge");

		Comparator<String> sortNames = new Comparator<String>() {

			@Override
			public int compare(String i, String j) {
				if (i.charAt(i.length() - 1) > j.charAt(j.length() - 1)) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(names, sortNames);

		System.out.println(names);

	}
}