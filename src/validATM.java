import java.util.Scanner;

/**
 * pozitív egész számból (pénzösszeg) kiszámolja hogy milyen módoin tud
 * visszadni a lehető legkevesebb címlettel
 * 
 * @author Páger Dániel
 *
 */
public class validATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int moneyAmount;
		do {
			System.out.print("Kérem Adja meg a pénzösszeget: ");
			moneyAmount = scanner.nextInt();
			System.out.println("A megadott pénzösszeg: " + moneyAmount);
			if (moneyAmount < 0) {
				System.out.println("Negatív pénzösszeg nem adható meg!");
			}
			if (moneyAmount % 5 != 0) {
				System.out.println("A meg adott öszeg nem fizethető ki mert nem osztható 5-el!");
			}
		} while (moneyAmount < 0 || moneyAmount % 5 != 0);

		int[] currencies = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5 };
		int remainingAmount = moneyAmount;
		int[] pieces = new int[currencies.length];
		for (int i = 0; i < currencies.length; i++) {
			pieces[i] = remainingAmount / currencies[i];
			remainingAmount = remainingAmount % currencies[i];
		}
//		System.out.println(Arrays.toString(pieces));
		for (int i = 0; i < currencies.length; i++) {
			System.out.println(currencies[i] + ": " + pieces[i] + "db");
		}
	}

}
