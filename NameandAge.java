import java.util.Scanner;
public class NameandAge{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");

        String Name = sc.nextLine();

        System.out.print("Enter your Age :");

        int Age = sc.nextInt();

        System.out.println("My name is :"+Name);
        System.out.print("My Age is :"+Age);
    }
}