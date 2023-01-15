import java.util.Objects;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void startGame() {

		int targetNum = (int) (Math.random() * 100);

		int maxTries = 4;
		int numTries = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("I am thinking of a number between 1 and 100... ");
		System.out.println("You've to guess the number within 4 attempts.");

		for (int i = 0; i < maxTries; i++) {
			System.out.print("Guess the Number: ");
			int guess = in.nextInt();
			numTries++;

			if (guess == targetNum) {
				System.out.println("Congratulations! You guessed the number in " + numTries + " attempts.");
				return;
			} else if (guess < targetNum) {
				System.out.println("Your guess is too low! You have " + (maxTries - numTries) + " more attempts left.");
			} else {
				System.out
						.println("Your guess is too high! You have " + (maxTries - numTries) + " more attempts left.");
			}
		}

		if (numTries == maxTries) {
			System.out.println("Oops! You are out of attempts.");
			System.out.println("The secret number was " + targetNum + ".");
		}
	}

	public static void main(String[] args) {

		startGame();

		System.out.println("Do you want to play again ?" + "\nType 'y' for Yes and 'n' for No");

		Scanner in = new Scanner(System.in);
		String sc = in.next();

		if (Objects.equals(sc, "y")) {
			startGame();
		}

		System.out.println("Thanks for Playing.");
		System.out.println("This game is developed by Farhan.");

	}

}
