import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Masukkan jumlah bilangan fibonacci yang ingin ditampilkan : ");
		int n = reader.nextInt();
		reader.close();

		for (int i = 0; i < n; i++) {
			int fib = getFibonacci(i);
			System.out.print(fib + ",");
		}
	}

	// rumus dari bilangan fibonacci adalah F(n) = F(n-1) + F(n-2)
	// sedangkan F(0) = 0 dan F(1) = 1
	static int getFibonacci(int n) {
		int fib = 0;
		if (n <= 1) {
			fib = n;
		} else {
			fib = getFibonacci(n - 1) + getFibonacci(n - 2);
		}
		return fib;
	}

}
