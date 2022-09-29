
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a RH: ");
		double rh = sc.nextDouble();
		System.out.println("Digite a RM: ");
		double rm = sc.nextDouble();
		double rc = rh + rm;
		if (rc > 2500) {
			System.out.printf("RENDA CONJUNTA : %.2f%n", rc);
			System.out.println("AL�QUATA UTILIZADA: 25%");
			System.out.printf("IMPOSTO DE RENDA: %.2f%n", rc * 0.25);
			System.out.printf("RENDA l�QUIDA: %.2f%n", rc - rc * 0.25);
		} else if (rc > 1500) {
			System.out.printf("RENDA CONJUNTA : %.2f%n", rc);
			System.out.println("AL�QUATA UTILIZADA: 15%");
			System.out.printf("IMPOSTO DE RENDA: %.2f%n", rc * 0.15);
			System.out.printf("RENDA l�QUIDA: %.2f%n", rc - rc * 0.15);
		} else if (rc > 900) {
			System.out.printf("RENDA CONJUNTA : %.2f%n", rc);
			System.out.println("AL�QUATA UTILIZADA: 10%");
			System.out.printf("IMPOSTO DE RENDA: %.2f%n", rc * 0.10);
			System.out.printf("RENDA l�QUIDA: %.2f%n", rc - rc * 0.10);
		} else if (rc < 900) {
			System.out.printf("RENDA CONJUNTA : %.2f%n", rc);
			System.out.println("AL�QUATA UTILIZADA: isento");
			System.out.printf("IMPOSTO DE RENDA: 0,00%n");
			System.out.printf("RENDA l�QUIDA: %.2f%n", rc);
		}

		sc.close();

	}

}
