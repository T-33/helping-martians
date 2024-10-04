import java.util.LinkedHashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] cargoLocations = new int[3];
		
		int attempts = 0;

		int minCargoLocation = 1;
		int maxCargoLocation = 7;

		for(int i = 0; i < cargoLocations.length; i += 1) {

			cargoLocations[i] = minCargoLocation + (int)(Math.random() * ((maxCargoLocation - minCargoLocation) + 1));

		}

		while (true) {

			LinkedHashSet<Integer> guessedLocationsSet = new LinkedHashSet<Integer>();



			int correctGuessNumber = 0;
			

			if(attempts == 5) {
				System.out.println("Too many attempts, the cargos have changed their location . RERUN the programm");
				break;
			}

			for (int i = 0; i < cargoLocations.length; i += 1) {

				int userGuess = sc.nextInt();

				guessedLocationsSet.add(userGuess);

			}

			Integer[] guessedLocationsArray = new Integer[guessedLocationsSet.size()];
			guessedLocationsArray = guessedLocationsSet.toArray(guessedLocationsArray);

			for (int i = 0; i < guessedLocationsArray.length; i += 1) {

				for (int j = 0; j < guessedLocationsArray.length; j += 1) {

					if (guessedLocationsArray[i] == cargoLocations[j])

						correctGuessNumber += 1;

				}

			}

			if(correctGuessNumber == 3) {
				System.out.println("You have correctly guessed all 3 locations");
				break;
			}

			attempts += 1;

			System.out.println(correctGuessNumber);
		}

		sc.close();
		
	}
}