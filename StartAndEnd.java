
import java.util.Scanner;

class StartAndEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start :");

        int n1 = sc.nextInt();

        System.out.print("Enter End :");

        int n2 = sc.nextInt();

        while (n1 <= n2) {
            System.out.println(n1);
            n1++;
        }

    }
}
