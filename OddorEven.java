import java.util.Scanner;
public class OddorEven{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number :");

        int number = sc.nextInt();

        if(number%2==0){
            System.out.print("The given number is even");
        }
        else{
            System.out.print("The given number is odd");
        }
    }
}