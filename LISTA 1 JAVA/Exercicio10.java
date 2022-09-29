import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de dias: ");
		int dias = sc.nextInt();
		sc.close();
		int ano = dias / 365;
		int resto = dias % 365;
		int mes = resto / 30;
		int dia = resto % 30;
		System.out.printf("%d ano (s)%n", ano);
		System.out.printf("%d m�s (es)%n", mes);
		System.out.printf("%d dia (s)%n", dia);
	}

}
