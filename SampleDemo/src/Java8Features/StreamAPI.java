package Java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 8, 3, 1, 2, 9);
		list.stream().sorted().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(n -> System.out.println(n));

		List<String> names = Arrays.asList("Gani", "Ram", "Jai", "Sita");
		names.stream().sorted().filter(n -> n.contains("i")).map(n -> n + 2).map(n -> n + "esh")
				.forEach(n -> System.out.println(n));

	}
}
