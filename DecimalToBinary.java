
import java.util.Scanner;

class DecimalToBinary {

    static Scanner sc = new Scanner(System.in);

    public static String Decimal2Binary(int number) {

        String binary =" ";

        while (number > 0) {

            int digit = number % 2;
            System.out.println("digit :" + digit);
            binary=digit+binary;
            number = number / 2;

        }

        return binary;

    }

    public static void main(String[] args) {

        System.out.println("Enter the number :");
        int number = sc.nextInt();
        String result=Decimal2Binary(number);
        System.out.println("Result :"+result);
    }
}
