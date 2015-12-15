public class Optimus {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
	String str = System.console().readLine();
	int orig = Integer.parseInt(str);
	int a = Integer.parseInt(str);
	int b = Integer.parseInt(str);
	int i = 0;
	int x = 0;
	for (i = 2; i < a; i++) {
		if (a % i == 0) {
			a++;
			i = 2;
			}
		}
	for (x = 2; x < b; x++) {
		if (b % x == 0) {
			b--;
			x = 2;
			}
		}
	if ((orig - b) < (a - orig)) {
		System.out.println(b);
	} else if ((a - orig) < (orig - b)) {
		System.out.println(a);
	} else if (a == b){
		System.out.println(a);
	} else {
		System.out.println(a + ", " + b);
	}
	}
}