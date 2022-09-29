import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite a primeira nota: ");
        float nota1 = leia.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = leia.nextFloat();

        float PesoA = (float) 3.5;
        float PesoB = (float) 7.5;

        nota1 = nota1 * PesoA;
        nota2 = nota2 * PesoB;
        float media = (nota1 + nota2) / 11;
        System.out.printf("MÉDIA = %.5f%n", media);
        leia.close();

    }

}
