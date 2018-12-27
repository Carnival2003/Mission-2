
public class HelloWorld {
	public static void main(String[] args) {
		int[] array = new int[20];
		int k;
		{
			for (int i = 0; i < array.length; i++) {
				array[i] = ((int) (Math.random() * 100));
			}

			for (int x : array) {
				System.out.print(x + " ");
			}

			System.out.println();
			for (int i = 0; i <= array.length / 2; i++) {
				k = array[i];
				array[i] = array[array.length - i - 1];
				array[array.length - 1 - i] = k;
			}
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}
}