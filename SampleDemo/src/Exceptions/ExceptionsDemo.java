package Exceptions;

public class ExceptionsDemo {

	public static void main(String[] args) {

		try {
			int ans = 5 / 4;
			System.out.println(ans);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Division by zero not allowed");
		} finally {
			System.out.println("The flow ends here");
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
