public class Maxnum {

	public static void main(String[] args) {
		String a = System.console().readLine();
		int num1 = Integer.parseInt(a);
		int num2 = 0;
		while (num2 != -1) {
			a = System.console().readLine();
			num2 = Integer.parseInt(a);
			if (num2 > num1) {
				num1 = num2;
			}
		}
		System.out.println(num1);
	}

}