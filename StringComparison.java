public class StringComparison{
    public static void main(String [] args){

        String fruit1=new String("apple");
        String fruit2=new String("apple");

        if(fruit1.equals(fruit2)){
            System.out.print("yes both fruits have same name");
        }
        else{
            System.out.print("No fruits have different names");
        }
    }
}