import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Masukkan angka (cth: 1.345.679) : ");
		// hapus semua karakter bukan angka
		String n = reader.next().replaceAll("[^0-9]+", "");
		reader.close();

		char[] chars = n.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			int numOfZero = chars.length - i - 1;

			// buat deret angka 0
			String zeros = "";
			for (int j = 0; j < numOfZero; j++) {
				zeros = zeros + "0";
			}

			System.out.println(String.valueOf(chars[i]) + zeros);
		}

	}

}
