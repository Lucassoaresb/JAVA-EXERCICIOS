import java.util.Scanner;

public class Exercicio14 {

	//public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	int x = sc.nextInt();
	//	sc.close();
	//	for (int i = x; i <= x+11; i++) {
	//		if (i % 2 != 0)System.out.println(i);
	//	}

	//}

//}
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int cont = 0;
        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
    }
	
}