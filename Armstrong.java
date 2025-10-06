
import java.util.Scanner;

class Armstrong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t\tEnter the 3 digit number :");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("It is an armstrong number ");
        } else {
            System.out.println("It is not a armstrong number ");
        }
    }
}
