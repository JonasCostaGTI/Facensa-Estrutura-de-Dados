package aula12;

public class Tabuada {

	public static void main(String[] args) {
		
		int i = multi(3, 4);
		
		System.out.println(i);
		
	}


	
	public static int multi(int fator1, int fator2){
		
		if (fator1 == 0) 
		
			return 0;
			return multi(fator1 - 1, fator2) + fator2;
	
	}
		
}



	


