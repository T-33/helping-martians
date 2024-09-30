import java.util.Scanner;

class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] cargoLocations = {3, 4, 1};
		int[] guessedLocations = new int[3];

		for (int i = 0; i < cargoLocations.length; i += 1) {
			guessedLocations[i] = sc.nextInt();
			System.out.println(guessedLocations[i]);
		}

		sc.close();
	}
}