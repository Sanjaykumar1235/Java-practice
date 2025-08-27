import java.util.Scanner;
public class ReverseNumber{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");

        // here i will give the input is 4321 it will store in number

        int number = sc.nextInt(); // so number=4321

        //  here i declare one variable like rev

        int rev=0;
        

        while(number!=0){

            int digit=number%10; // digit =4321%10  ,here it will take the last number 4,remaning number is 321
            rev=rev*10+digit; // 0*10+4=4
                             // 0*10+3=3 ,like this so final ans is 1234
            number/=10;

        }
        System.out.print(rev);
    }
}