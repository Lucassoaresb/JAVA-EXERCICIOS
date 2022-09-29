
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");

		int n = sc.nextInt();

		for (int i = 1; i <= n + 1; i++) {
			if (i % 4 == 0)
				System.out.println("PUM");
			else
				System.out.print(i + " ");
		}
		sc.close();

	}

}
