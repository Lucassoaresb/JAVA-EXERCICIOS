import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu numero de funcionario: ");
		int numero = leia.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		int horas = leia.nextInt();
		System.out.println("Digite o valor que voce recebe por hora: ");
		float valor = leia.nextFloat();
		
		float salario = horas * valor;
		System.out.printf("NUMERO = %d%n",numero);
		System.out.printf("SALARIO = R$ %.2f%n",salario);
		
		leia.close();
	}

}