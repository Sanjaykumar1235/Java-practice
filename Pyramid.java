public class Pyramid{
    public static void main(String [] args){

        int n=5;
        for(int j=1;j<=5;j++){
            //  J is consider as rows so total 5 rows

            for(int s=j;s<n;s++){

            // S is consider as space .how it will works
            // Step:1---> if j=1 ,s=1;s<5 ,now subract this like 5-1=4,so it give 4 space to print first     
            // Step:2---> if j=2 ,s=2;s<5 ,now subract this like 5-2=3,so it give 3 space to print first                 Step:3---> if j=3 ,s=3;s<5 ,now subract this like 5-3=2,so it give 2 space to print first      
            // Step:4---> if j=4 ,s=4;s<5 ,now subract this like 5-4=1,so it give 1 space to print first  
            // Step:5---> if j=5 ,s=5;s<5 ,now subract this like 5-5=0,so it give 0 space to print first    
                System.out.print(" ");
            }
            for(int i=1;i<=(2*j-1);i++){
                //  j=5 so it is (2*5-1) = total 9 star

                //  i<=(2*1-1) = 1 ,it will print first star with space of 4            *
                //  i<=(2*2-1) =3 ,it will print second star with space of 3          * * *
                //  i<=(2*3-1) =5 ,it will print second star with space of 2        * * * * *
                //  i<=(2*4-1) =7 ,it will print second star with space of 1      * * * * * * *
                //  i<=(2*5-1) =9 ,it will print second star with space of 0     * * * * * * * * *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}