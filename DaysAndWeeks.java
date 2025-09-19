import java.util.Scanner;
class DaysAndWeeks{
    public static void main(String [] args) throws Exception{

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the days :");

        int days = sc.nextInt();

        System.out.println("Processing.......");
        Thread.sleep(2000);

        if(days==1){
            System.out.println("Sunday");
        }
        else if (days==2){
            System.out.println("Monday");
        }
         else if (days==3){
            System.out.println("Tuesady");
        }
         else if (days==4){
            System.out.println("wednesday");
        }
         else if (days==5){
            System.out.println("thursday");
        }
         else if (days==6){
            System.out.println("friday");
        }
         else if (days==7){
            System.out.println("Saturday");
        }
    
    }
}
