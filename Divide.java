import java.util.Scanner;
public class Divide{
    public static void main(String [] args){

        // To create object name scanner to get input from the user
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number :");

        int number=sc.nextInt();
        

        if(number%3==0 && number%5==0){
            System.out.print("Yes this number is divided by both 3 and 5 ");
        }
        else{
            System.out.print("No this number is not divided");
        }
    }
}