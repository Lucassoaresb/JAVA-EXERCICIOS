import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor[] = new int[3];
		int maior = 0;
		
		
		for(int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " +(i+1)+"° numero: ");
			valor[i] = sc.nextInt();
			if(valor[i] > maior) {
				maior = valor[i];
			}
		}
		int menor = maior;
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor) {
				menor = valor[j];
			}
		}
		System.out.println("MAIOR = " + maior);
		System.out.println("MENOR = " + menor);
		sc.close();
	}

}