import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a dist�ncia total: ");
		int distancia = sc.nextInt();
		System.out.println("Qual o total de combust�vel gasto: ");
		double combustivel = sc.nextDouble();
		sc.close();
		double kml = distancia / combustivel;

		System.out.printf("%.3f km/l", kml);

	}

}
