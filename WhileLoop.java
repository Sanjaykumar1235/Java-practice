import java.util.Random;
public class WhileLoop{
    public static void main(String [] args){

        int num=0;

        Random rand=new Random();
        while(num!=5){
            num=rand.nextInt(10);
             System.out.println(num);
            
            
        }
       
    }
}