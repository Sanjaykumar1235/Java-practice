import java.util.Scanner;
class Sample{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=sc.nextInt();

        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        }
        else  {
            System.out.println("Zero");
        }
    }
}