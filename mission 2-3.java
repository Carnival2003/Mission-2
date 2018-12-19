import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("Введите число: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int summa = 0;
		for (int i = 1; i <= n; i++) {
			{
				if (i % 3 == 0) {
					summa = summa + i;
					System.out.println("Сумма равна: " + summa);
				}
			}
		}
	}
}