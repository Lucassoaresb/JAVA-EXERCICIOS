import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Nome do vendender: ");
        String nome = leia.next();
        System.out.println("Salario fixo: ");
        double salfixo = leia.nextDouble();
        System.out.println("Quantidade de vendas: ");
        double qtdevendas = leia.nextDouble();

        double comissao = 0.15;
        double bonus = (qtdevendas * comissao);
        double total = salfixo + bonus;

        System.out.printf("TOTAL: %.2f", total);
        leia.close();
        
    }
}
