import java.util.LinkedHashMap;
import java.util.Optional;

public class Intervi {

	public static void main(String[] args) {

		String str = "mabbabbbambca";
		LinkedHashMap<Character, Long> hp = new LinkedHashMap();
		Optional<Character> times = str.chars().mapToObj(c -> (char) c).filter(e -> {
			if (!hp.containsKey(e)) {
				hp.put(e, hp.getOrDefault(e, (long) 0) + 1);
				return true;
			} else {
				return false;
			}
		}).findFirst();

		System.out.println(times.get());
	}
}
