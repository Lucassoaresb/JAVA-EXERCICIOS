import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
        int N = sc.nextInt();
        sc.close();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println(anterior);
        	else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual;
        	atual = proximo;
        }
    }

}