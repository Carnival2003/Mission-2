import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int[] array;
		array = new int[20];
		int max = array[0];
		{
			for (int i = 0; i < array.length; i++) {
				array[i] = ((int) (Math.random() * 6));
				System.out.println(array[i]);
			}
		}
		{
			for (int i = 1; i < array.length; i++)
				max = Math.max(max, array[i]);
		}
		System.out.println("Первая оценка:  " + array[0]);
		System.out.println("Последняя оценка:  " + array[19]);
		System.out.println("Наивысшая оценка оценка:  " + max);
	}
}