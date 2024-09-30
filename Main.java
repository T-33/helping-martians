import java.util.Scanner;

class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] cargoLocations = {3, 4, 1};
		int[] guessedLocations = new int[3];

		int correctGuessNumber = 0;
		int attempts = 0;

		for (int i = 0; i < cargoLocations.length; i += 1) {

			guessedLocations[i] = sc.nextInt();

		}

		sc.close();

		for (int i = 0; i < cargoLocations.length; i += 1) {

			for (int j = 0; j < cargoLocations.length; j += 1) {

				if(guessedLocations[i] == cargoLocations[j]) correctGuessNumber += 1;

			}

		}

		System.out.println(correctGuessNumber);

	
	}
}