import java.util.Scanner;
public class Nestedif{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary :");
        int salary=sc.nextInt();

        if(salary>20000){
        //  If this condition is correct it will go for next if statment

            System.out.println("You are eligible for loan");

            System.out.print("Enter your loan amount :");

            int loan = sc.nextInt();

            if(loan<=50000){
                System.out.print("Your loan is accepted");
            }
            else{
                System.out.print("Your loan limit is 50000");
            }
        }
        else{
            System.out.print("You are not eligible to apply for loan");
        }
    }
}