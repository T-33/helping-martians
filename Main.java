import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] cargoLocations = new int[3];
		

		int minCargoLocation = 1;
		int maxCargoLocation = 7;

		for(int i = 0; i < cargoLocations.length; i += 1) {

			cargoLocations[i] = minCargoLocation + (int)(Math.random() * ((maxCargoLocation - minCargoLocation) + 1));

		}

		while (true) {
			
			int[] guessedLocations = new int[3];

			int correctGuessNumber = 0;
			int attempts = 0;

			if(attempts == 5) {
				System.out.println("Too many attempts, the cargos have changed their location . RERUN the programm");
				break;
			}

			for (int i = 0; i < cargoLocations.length; i += 1) {

				guessedLocations[i] = sc.nextInt();

			}

			for (int i = 0; i < cargoLocations.length; i += 1) {

				for (int j = 0; j < cargoLocations.length; j += 1) {

					if (guessedLocations[i] == cargoLocations[j])

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