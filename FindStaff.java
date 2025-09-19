import java.util.Scanner;
class FindStaff{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("1.Java\n2.Sql");

        System.out.print("Enter the skills :");

        int skills=sc.nextInt();


        switch(skills){

            case 1:{

                System.out.println("1.Tabrez\n2.Shivaraj\n3.Shekar");
                System.out.print("select the trainner :");

                int trainer = sc.nextInt();
                switch(trainer){

                case 1:{
                    System.out.println("Your select the trainer is Tabrez");
                     break;
                }
                   case 2:{
                    System.out.println("Your select the trainer is Shivaraj");
                    break;
                }
                   case 3:{
                    System.out.println("Your select the trainer is Shekar");
                     break;
                    
                }
                 default :{
                    System.out.println("Invalid");
                     break;
                }

            }
            break;
            }
             case 2:{

                System.out.println("1.Nagarj\n2.Govrov\n3.Vinod");
                System.out.print("select the trainner :");

                int trainer = sc.nextInt();
                switch(trainer){

                case 1:{
                    System.out.println("Your select the trainer is Nagraj");
                     break;
                }
                   case 2:{
                    System.out.println("Your select the trainer is Govrov");
                     break;
                }
                   case 3:{
                    System.out.println("Your select the trainer is Vinod");
                     break;
                }
                 default :{
                    System.out.println("Invalid");
                     break;
                }
            }
            }
        }
    }
}