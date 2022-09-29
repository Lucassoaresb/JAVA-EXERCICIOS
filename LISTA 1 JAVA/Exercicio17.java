import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rounds, contDiv = 2;
	
		
		while(true) {
			System.out.print("Digite a quantidade de n�meros que deseja testar: ");
			try {
				rounds = sc.nextInt();
				if(rounds < 1 && rounds >= 100) {
					System.err.println("Digite valores apenas entre 1 e 100");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore n�mericos inteiros!");
			}
		}
		
		int[] numbers = new int[rounds];
		
		for (int i = 0; i < rounds; i++) {
			while(true) {
				System.out.print("Digite o : " + (i+1) + "� n�mero: ");
				try {
					numbers[i] = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					sc.next();
					System.err.println("Digite apenas valore n�mericos!");
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(ehPrimo(numbers[i])) {
				System.out.println(numbers[i] + " -> � primo!");
			} else {
				System.err.println(numbers[i] + " -> N�o � primo!");
			}
		}
		
		sc.close();
	}
private static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}
}


