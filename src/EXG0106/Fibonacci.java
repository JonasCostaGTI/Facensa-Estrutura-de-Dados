package EXG0106;

public class Fibonacci {
	


	public static void main(String[] args) {
		
	
		for (int i = 0; i <= 10; i++) {
	            System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
	        }
	 
		

	}

	private static long fibo(int i) {
		if (i < 2) {
            return i;
        } else {
            return fibo(i - 1) + fibo(i - 2);
        }
		
	}

}
