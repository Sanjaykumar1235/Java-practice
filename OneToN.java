import java.util.Scanner;

class OnetoN
{
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String [] args){
		
		
		System.out.print("Enter the value of n :");
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			System.out.println(i);
		}
	}
}