package co_task;

public class Co_Task2 {


	// Q. "Write a program to generate the following output in java?
//		*
//		**
//		****
//		*****
//		******
	
		public static void main(String[] args) {	
			
			
	            for(int i=1;i<=6;i++) {
				
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
					System.out.println();
			}
		}	
}
