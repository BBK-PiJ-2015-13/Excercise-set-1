public class GuessNumber {

	public static void main(String[] args) {
		int numberToGuess = (int) Math.abs(1000 * Math.random());
		System.out.println("Guess the number: ");
		String guess = System.console().readLine();
		int guessNum = Integer.parseInt(guess);
		int guesscount = 1;
		while (guessNum != numberToGuess) {
			guesscount++;
			if (guessNum > numberToGuess) {
				System.out.println("Too high! Try again.");
			} else if (guessNum < numberToGuess) {
				System.out.println("Too low! Try again.");
			}
			guess = System.console().readLine();
			guessNum = Integer.parseInt(guess);
		}
		System.out.println("Well done! The answer was " + numberToGuess + " and it took you " + guesscount + " guesses!");
	}
	
}