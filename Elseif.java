import java.util.Scanner;
public class Elseif{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your maths mark :");

        int mark = sc.nextInt();

        if(mark>35 && mark<=60)
        {
            System.out.print("Average");
        }
        else if(mark>60 && mark<=80){
            System.out.print("Good");
        }
        else if(mark>80 && mark<100){
            System.out.print("Excellent");
        }
        else{
            System.out.print("Worst");
        }
    }
}