import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
		

		if (x > 0 && y > 0) {
			System.out.println("PRIMEIRO");
		} else if (x < 0 && y > 0) {
			System.out.println("SEGUNDO");
		} else if (x < 0 && y < 0) {
			System.out.println("TERCEIRO");
		} else {
			System.out.println("QUARTO");
		}
		sc.close();
		}
		// caso o valor seja zero em alguma das opções a resposta sera nula
		x = sc.nextInt();
		y = sc.nextInt();
	}
}
