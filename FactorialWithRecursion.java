import java.util.Scanner;
class FactorialWithRecursion 
{
	static Scanner sc = new Scanner(System.in);
	static int ans=1;
	public static int factorial(int number){
		
		if (number>=2)
		{
			ans=ans*number;
			
			number--;
			factorial(number);
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the number :");
		int number=sc.nextInt();
		int res=factorial(number);
		System.out.println("Result :"+res);
	}
}
