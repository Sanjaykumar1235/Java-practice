import java.util.Scanner;
public class StringComparison2{
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("Win or loss :");

        String Rcb = sc.nextLine();

        if(Rcb.equals("win")){
            System.out.print("Eeee sala cup namdee");

        }
        else{
            System.out.print("No cup ");
        }
    }
}