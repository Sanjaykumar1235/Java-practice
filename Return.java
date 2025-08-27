public class Return{
    
    String getName(){
        return "Sanjay";
    }

        public static void main(String [] args){
            Return re=new Return();
            String name=re.getName();
            System.out.print(name);
        }
    }
