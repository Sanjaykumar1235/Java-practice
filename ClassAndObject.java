public class ClassAndObject{

    // Whatever we create under this function is called class
    
    String name=" ";
    String color=" ";
    int price=0;

    public static void main(String [] args){

        // Whatever we use under this function is called object

        // Create object using class name

        ClassAndObject car=new ClassAndObject();

        // Give the value for class using object 
        car.name="BMW";
        car.name="Black";
        car.price=10000000;

        System.out.print(car.name);
    }
}