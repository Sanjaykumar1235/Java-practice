public class Star{
    public static void main(String [] args){


        for(int j=1;j<=5;j++){
            //  this is outer loop and also consider as rows

        for(int i=1;i<=j;i++){
            //  this is inner loop and consider as column
            //  i<=j -----> i<=1 so it print one * 
            //  i<=2 ----> print * * , like this   
             System.out.print(" * ");
        }
        System.out.println();
        }
    }
}