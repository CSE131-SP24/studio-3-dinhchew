package studio3;

public class Sieve {

	public static void main(String[] args) {

		boolean [] numberList = new boolean [41]; 
		
		for (int i = 0;i <= numberList.length; i++) {
			if (i/2 == 0) { 
				 numberList [i] = true; 
				 System.out.print(numberList);
			}
			if (i/3 == 0) { 
				 numberList [i] = true; 
				 System.out.print(numberList);
			}
			if (i/4 == 0) { 
				 numberList [i] = true; 
				 System.out.print(numberList);
			}  
			if (i/5 == 0) { 
				 numberList [i] = true; 
				 System.out.print(numberList);
			} 
			if (i/6 == 0) { 
				 numberList [i] = true; 
				 System.out.print(numberList);
			}
				
		}




	}

}
