public class Sorter {
	
	public static void main(String[] args) {
		System.out.println("Please enter three numbers for sorting: ");
		String a = System.console().readLine();
		String b = System.console().readLine();
		String c = System.console().readLine();
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int num3 = Integer.parseInt(c);
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		} else if (num1 < num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		} else {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
	}
	
}