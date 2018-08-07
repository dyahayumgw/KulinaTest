import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Mencari bilangan prima dari 0 sampai : ");
		int n = reader.nextInt();
		reader.close();

		// bilangan prima dimulai dari 2
		for (int i = 2; i <= n; i++) {
			int isPrima = 1;

			for (int j = 2; j < i; j++) {
				// bilangan input dimodulus dengan pembagi mulai dari 2 sampai i-1
				// jika ada hasil 0 maka bilangan tersebut bukan bilangan prima
				// karena bilangan prima hanya bisa dibagi 1 dan dirinya sendiri
				if (i % j == 0) {
					isPrima = 0;
					break;
				}

			}

			if (isPrima == 1) {
				System.out.print(i + ",");
			}
		}
	}

}
