import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("Введите любое число: ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		sc.close();
		System.out.println(n);
		for (double i = 1; i < n; i++) {
			{
				if (n % i == 0) {
					System.out.println("Число простое");
					return;
				} else {
					System.out.println("Число составное, повторите попытку...");
					return;
				}
			}
		}
	}
}