public class Primes {
	
public static void main(String[] args) {
	System.out.println("Please enter a number:");
	String str = System.console().readLine();
	int a = Integer.parseInt(str);
	int i = 0;
	for (i = 2; i < a; i++) {
		if (a % i == 0) {
			System.out.println("The number is not a prime.");
			break;
			}
		}
	if (i == a) {
		System.out.println("The number is prime.");
	}	
	}
}