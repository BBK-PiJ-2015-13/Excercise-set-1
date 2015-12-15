public class Goup {

	public static void main(String[] args) {
		String a = System.console().readLine();
		int num1 = Integer.parseInt(a);
		int num2 = 0;
		boolean x = false;
		while (true) {
			a = System.console().readLine();
			if (a.equals("")) {
				break;
			}
			num2 = Integer.parseInt(a);
			if (num2 == -1) {
				break;
			}
			if (num2 - num1 != 1 && num1 - num2 != 1) {
				x = true;
			}
			num1 = num2;
		}
		if (x) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}