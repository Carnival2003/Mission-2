import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int[] array;
		array = new int[20];
		int max = array[0];
		{
			for (int i = 0; i < array.length; i++) {
				array[i] = ((int) (Math.random() * 100));
				System.out.print(array[i] + ", ");
			}
		}
		{
			for (int i = array.length - 1; i >= 0; --i) {
				System.out.print(array[i] + ", ");
			}
		}
	}
}