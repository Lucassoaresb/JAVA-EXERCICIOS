import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		double peso = sc.nextDouble();
		System.out.println("Digite sua altura:");
		double altura = sc.nextDouble();
		sc.close();
		
		double imc = peso/(altura*altura);
		
		if(imc < 20) {
			System.out.println("IMC= "+imc+" Abaixo do peso");
		}else if(imc < 25) {
			System.out.println("IMC= "+imc+" Peso Normal");
		}else if(imc < 30) {
			System.out.println("IMC= "+imc+" Sobrepeso");
		}else if(imc < 40) {
			System.out.println("IMC= "+imc+" Obeso");
		}else if(imc > 40) {
			System.out.println("IMC= "+imc+" Obeso Mórbido");
		}
		
	}

}
