import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int sum = 0;
		int array[] = new int[10];
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + ", ");
		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Минимальное значение: " + min + " Максимальное значение: " + max);

		if (min < max) {
			for (int i = min + 1; i < max; i++)
				sum += array[i];
		} else if (min > max) {
			for (int i = max + 1; i < min; i++)
				sum += array[i];
		}
		System.out.println("Сумма между максимальным и минимальным значением равна: " + sum);
	}
}