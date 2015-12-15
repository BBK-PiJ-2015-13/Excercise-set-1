public class PrintPrimes {
	
public static void main(String[] args) {
	int i = 0;
	for (int a = 0; a < 1000; a++) {
		for (i = 2; i < a; i++) {
			if (a % i == 0) {
				break;
				}
			}
		if (i == a) {
		System.out.println(a);
		}
		}
	}
}