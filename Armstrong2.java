
import java.util.Scanner;

class Armstrong2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the digit :");
        int number = sc.nextInt(); // 1634

        int temp = number;// 1634

        int sum = 0; // 0

        int length = String.valueOf(number).length();//1634------> 4
        while (number > 0) {

            int digit = number % 10; //1634%10=4  163%10=3   16%10=6
            sum = sum + power(digit, length); // 0+(4,4) ----256---->sum=256  256+(3,4)----->256+81=337 -----337+(6,4)------337+1296=1633

            number = number / 10;
            //1634/10=163  163/10=16   16/10=1

        }

        if (temp == sum) {
            System.out.println("It is an armstrong number ");

        } else {
            System.out.println("It is Not a armstrong numebr ");
        }

    }

    public static int power(int digit, int power) {

        int result = 1;

        for (int i = 1; i <= power; i++) //power=4
        {
            result = result * digit;

        }

        return result;
    }

}
