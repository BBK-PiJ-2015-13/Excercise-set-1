public class Pokerhand {

	public static void main(String[] args) {
		System.out.println("Enter a card number: ");
		String a = System.console().readLine();
		int num1 = Integer.parseInt(a);
		int num3 = 0;
		System.out.println("Enter a suit: ");
		String suit1 = System.console().readLine();
		String suit2;
		String suit3 = "";
		String suit4;
		String suit5;
		int num2 = 0;
		boolean x = false;
		int suitmatch = 0;
		int pair = 0;
		int notpair = 0;
		boolean falsepair = false;
		boolean flush = false;
		boolean poker = false;
		boolean fullhouse = false;
		boolean threekind = false;
		boolean twopair = false;
		boolean onepair = false;
		while (true) {
			System.out.println("Enter a card number: ");
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
			if (num2 == num1 || num2 == num3) {
				if (!falsepair) {
					pair++;
				} else {
					notpair++;
				}
			} else {
				falsepair = true;
			}
			if (pair >= 3 || notpair >= 3) {
				poker = true;
			} else if ((pair >= 2 && notpair >= 1) || (pair >= 1 && notpair >= 2)) {
				fullhouse = true;
			} else if (pair >= 2 || notpair >= 2) {
				threekind = true;
			} else if (pair >= 1 && notpair >= 1) {
				twopair = true;
			} else if (pair >= 1 || notpair >= 1) {
				onepair = true;
			}
			System.out.println("Paircount = " + pair + " " + notpair);
			num3 = num1;
			num1 = num2;
			System.out.println("Enter a suit: ");
			suit2 = System.console().readLine();
			if (suit2.equals(suit1) || suit2.equals(suit3)) {
				suitmatch++;
			}
			if (suitmatch >= 3) {
				flush = true;
			}
			suit3 = suit1;
			suit1 = suit2;
		}
		if (!x) {
			if (flush) {
				System.out.println("Straight Flush!");
			} else {
				System.out.println("Straight");
			}
		} else {
			if (poker) {
				System.out.println("Four of a kind!");
			} else if (fullhouse) {
				System.out.println("Fullhouse!");
			} else if (flush) {
				System.out.println("Flush!");
			} else if (threekind) {
				System.out.println("Three of a kind!");
			} else if (twopair) {
				System.out.println("Two pairs");
			} else if (onepair) {
				System.out.println("One pair");
			} else {
				System.out.println("No hand...");
			}
		}
	}

}