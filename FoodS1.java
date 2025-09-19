import java.util.Scanner;
class FoodS1{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of food :");

        String food =sc.nextLine();

        switch(food){

            case "Idly"->{
                System.out.println("Idly price is :20");
          
            }

            case "Poori"->{
                System.out.println("Poori price is :40");
            }

            case "Dosa"->{
                System.out.println("Dosa price is :50");
            }
        }
    }
}