package co_task;

public class Co_Task1 {
	
	//Q.How do we reverse a string?

			public static void main(String[] args) {
				
				String name="Mukund";
				int leng=name.length();
				String rev="";
				
				for (int i=leng-1;i>=0;i--) {
					
					rev=rev+name.charAt(i);
					
				}
				System.out.println("Reverse of "+name+" is "+rev);
			}



}
