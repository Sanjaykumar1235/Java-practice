import java.util.Scanner;
class Factorial{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){

        System.out.print("Enter the number :");
        int number=sc.nextInt();
        int result=getFactorial(number);
        System.out.println("Result :"+result);




    }
    public static int getFactorial(int number){
        int factorial=1;

        for(int i=1;i<=number;i++){

          factorial=factorial*i;
        }
        return factorial;
    }
}