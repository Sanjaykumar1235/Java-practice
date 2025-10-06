import java.util.Scanner;
class Strong_number{

    static Scanner sc = new Scanner(System.in);
   public static void main(String [] args){

    System.out.print("Enter the number :");
    int number=sc.nextInt();
    int temp=number;

    int sum=0;

    while(number>0){


        int digit=number%10;
        // System.out.println("Digit is :"+digit);
        sum=sum +strongNumber(digit);
        // System.out.println("Sum is :"+sum);
        number=number/10;
    }

    if(temp==sum){
        System.out.println("This is a strong number ");
    }
    else{
        System.out.println("This is not a strong number ");
    }
   }

   public static int strongNumber(int digit){

    int factorial=1;
    for(int i=1;i<=digit;i++){

        factorial=factorial*i;
        // System.out.println("Factorial is :"+factorial);

    }
    return factorial; 
   }
}