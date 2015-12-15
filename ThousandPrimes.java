public class ThousandPrimes {
	
public static void main(String[] args) {
	int x = 0;
	int i = 0;
	int a = 0;
	while (x < 1000) {
	for (i = 2; i < a; i++) {
		if (a % i == 0) {
			break;
			}
		}
		if (i == a) {
		x++;
		System.out.println(a);
		}
		a++;
		}
		System.out.println("The number of primes: " + x);
	}
	}