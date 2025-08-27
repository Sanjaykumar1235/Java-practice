import java.util.Scanner;
public class UsesofnextLine{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");

        String name = sc.nextLine();

        System.out.print("Enter your age :");
        int Age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your address :");
        String address = sc.nextLine();

        System.out.println("Your name is :"+name);
        System.out.println("My age is :"+Age);
        System.out.print("My address is :"+address);

    }
}