import java.util.Scanner;
class Skills
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args){
		
		boolean flag = true;
		
		do{
		
		System.out.println("1.java\n2.sql\n3.testing\n4.exit");
		System.out.print("Enter the skills : ");
		
		int skills = sc.nextInt();
		
		
		switch(skills){
			
			
			case 1->{
				
				System.out.println("Sanjay is here......");
			}
			
			case 2->{
				
				System.out.println("Harish is here......");
			}
			
			
			case 3->{
				
				System.out.println("Vijay is here......");
			}
			
			
			case 4->{
				
				flag=false;
			}
		}
		
		
		}
		
		while(flag);{
		
		System.out.println("Thank you");
		}

		
		
			
	}
}