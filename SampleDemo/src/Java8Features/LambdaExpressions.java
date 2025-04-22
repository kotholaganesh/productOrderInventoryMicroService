package Java8Features;

interface functionalInterface {
	void perform();
}

public class LambdaExpressions {
	public static void main(String[] args) {
		functionalInterface obj = () -> System.out.println("Hi hello");

		obj.perform();
	}
}
