package Java8Features;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) throws NullPointerException {

		User user = new User();

		if (user.getName().isPresent() && user.getName().get().equalsIgnoreCase("Gani")) {
			System.out.println("Thats true");
		} else {
			System.out.println("That's Not true");
		}

		System.out.println("Program should end 1");

		System.out.println("Program should end 2");

	}

}

class User {
	private String name;

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
}
