public class Exercicio35 {

	public static void main(String[] args) {

		double formula = 0;
		double dobro = 1;

		for (int i = 1; i <= 39; i += 2) {
			formula += i / dobro;
			dobro *= 2;
		}

		System.out.println(formula);
	}

}
