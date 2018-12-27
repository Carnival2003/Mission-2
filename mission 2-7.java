import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("Введите размер квадратного массива: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[][] = new int[size][size];
		int i, j;

		for (i = 0; i < array.length / 2 + 1; i++) {
			for (j = 0; j < array[i].length; j++) {
				if ((j < i) || (j > (array[i].length - 1 - i)))
					array[i][j] = 0;
				else
					array[i][j] = 1;
			}
		}

		for (i = array.length - 1; i >= array.length / 2; i--) {
			for (j = 0; j < array[i].length; j++) {
				if ((j < (array[i].length - 1 - i)) || (j > i))
					array[i][j] = 0;
				else
					array[i][j] = 1;
			}
		}
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println(" ");
		}
	}

}
