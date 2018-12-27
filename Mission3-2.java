import java.util.Random;
import java.util.Scanner;

public class Games {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = (char) ('A' + new Random().nextInt(26));
		System.out.println(ch);
		System.out.println("Игра угадай букву.");

		for (char i = 0; i < 26; i++) {
			char s = sc.next().charAt(0);

			if (ch == s) {
				System.out.println("Вы угадали!");
				break;
			} else {
				System.out.println("Попробуйте еще раз.");

				if (Character.getNumericValue(ch) > Character.getNumericValue(s)) {
					System.out.println("Моя буква меньше.");
				} else if (Character.getNumericValue(ch) < Character.getNumericValue(s)) {
					System.out.println("Моя буква больше.");
				}
			}
		}
	}
}