public class Multiplyer {

	public static void main(String[] args) {
		System.out.println("Please enter numbers to multiply:");
		String a = System.console().readLine();
		String b = System.console().readLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int z = 0;
		for (int i = 0; i < y; i++) {
			z += x;
		}
		System.out.println("The result is: " + z);
	}

}