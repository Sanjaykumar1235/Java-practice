import java.util.Scanner;
public class PrimeNumber{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        
        // get input from the user ,if i give 4
        int number=sc.nextInt();  //number=5

        //  declare count

        int count=0;

        for(int i=1;i<=number;i++){  // (i=1;i<=5;i++)
            if(number%i==0){ //5%1=0,5%2!=0,5%3!=0,5%4!=0,5%5=0
                count++;  
                
            }
        }
            if(count==2){ // count ==2 it means if i give input 5 ,the number will divide only 1st table and 5th table only
                System.out.print("This is prime number");
            }
            else{
                System.out.print("This is not a prime number");
            }
        }
    }
