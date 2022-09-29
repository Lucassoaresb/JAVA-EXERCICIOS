
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tempo em segundos: ");
		int segundos = sc.nextInt();
		sc.close();
		int h = segundos / 3600;
		int resto = segundos % 3600;
		int m = resto / 60;
		int s = resto % 60;

		System.out.printf("HH:MM:SS= " + h + ":" + m + ":" + s);

	}

}
