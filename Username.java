import java.util.Scanner;
public class Username{
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
                System.out.print("Enter the username :");

        String username = sc.nextLine();

        if(username.length() < 4 || username.length() >12){
            System.out.print("Username must be between 4 and 12 character");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.print("username must not contain space or underscore");
        }
        else{
            System.out.print("Welcome " + username);
        }
    }
}