import java.util.Scanner;
class FibonacciSeries{

    static Scanner sc = new Scanner(System.in);
    public static void Fibonacci(int limit){
        int first_number=0;
        int second_number=1;

        for (int i=1;i<=limit;i++){

            System.out.print(first_number+" ");
            int third_number=first_number+second_number;
            first_number=second_number;
            second_number=third_number;
        }




    }
    public static void main(String [] args){

        System.out.print("Enter the limit :");
        int limit =sc.nextInt();
        Fibonacci(limit);
    }
}