public class Picalc {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		String str = System.console().readLine();
		int orig = Integer.parseInt(str);
		double sig = 0.0;
		int k = 0;
		for (k = 0; k < orig; k++) {
			sig += 4 * ((Math.pow((-1), k)) / ((2 * k) + 1));
			if (sig >= 3.14159265358 && sig < 3.141592653581) {
				break;
			}
		}
		System.out.println(sig);
		System.out.println(k);
	}

}