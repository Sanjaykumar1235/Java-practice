
import java.util.Scanner;

class FibonacciWithRecursion {

    static Scanner sc = new Scanner(System.in);
    static int first_number = 0;
    static int second_number = 1;

    public static void fibonacciR(int n) {

        if (n >= 0) {
            System.out.println(first_number + " ");
            int third_number = first_number + second_number;

            first_number = second_number;

            second_number = third_number;
            n--;
            fibonacciR(n);
        }
      

    }

    public static void main(String[] args) {
        System.out.print("\t\t\tEnter the number :");
        int number = sc.nextInt();
        fibonacciR(number);
    }
}
