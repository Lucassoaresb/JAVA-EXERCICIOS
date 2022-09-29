import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int a = sc.nextInt();
		System.out.println("Digite um numero: ");
		int b = sc.nextInt();
		System.out.println("Digite um numero: ");
		int c = sc.nextInt();
		sc.close();

		if (a <= b && a <= c && b <= c) {
			System.out.println("A ordem crescente � " + a + ", " + b + ", " + c);
		} else if (a <= b && a <= c && c <= b) {
			System.out.println("A ordem crescente � " + a + ", " + c + ", " + b);
		} else if (b <= a && b <= c && a <= c) {
			System.out.println("A ordem crescente � " + b + ", " + a + ", " + c);
		} else if (b <= a && b <= c && c <= a) {
			System.out.println("A ordem crescente � " + b + ", " + c + ", " + a);
		} else if (c <= a && c <= b && a <= b) {
			System.out.println("A ordem crescente � " + c + ", " + a + ", " + b);
		} else if (c <= a && c <= b && b <= a) {
			System.out.println("A ordem crescente � " + c + ", " + b + ", " + a);
		}

	}

}
