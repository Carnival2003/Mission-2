public class Mission {
	static int calculateFactorial(int n){
		int result = 1;
		for (int i = 10; i <=n; i ++){
			result = result*i;
		}
		return result;
	}	
 
	public static void main(String[] args){
		System.out.println(calculateFactorial(15)); 
	}
}
