
import java.util.Scanner;

class Swiggy {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t Welcome to Swiggy");
        System.out.println("------------------------");

        System.out.println("1.Bugari\n2.A2B\n3.Amma Canteen");

        System.out.print("Select the hotels : ");

        int hotles_selection = sc.nextInt();
        System.out.println("Processing........");

        Thread.sleep(2000);

        switch (hotles_selection) {

            case 1 -> {

                System.out.println("\t\t\t Welcome to Bugari");

                System.out.println("------------------------");

                System.out.println("You are enter the Bugari hotel");

                System.out.println("1.Biriyani");
                System.out.println("2.Chicken Rice");
                System.out.println("3.Parota");

                System.out.print("Select the food :");

                int menu = sc.nextInt();

                switch (menu) {

                    case 1 -> {

                        System.out.println("\t\t\t biriyani ");

                        System.out.println("------------------------");

                        int price = 150;

                        System.out.println("Enter the quantity of biriyani : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);


                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } //Biriyani

                    case 2 -> {
                        System.out.println("\t\t\tYou order Chicken Rice ");

                        System.out.println("------------------------");

                        int price = 100;

                        System.out.println("Enter the quantity of Chicken rice : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } // Chicken rice

                    case 3 -> {
                        System.out.println("\t\t\tYou order Parota ");

                        System.out.println("------------------------");

                        int price = 20;

                        System.out.println("Enter the quantity of Parota : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } // Parota
                }
            }  //Bugari

            case 2 -> {
                System.out.println("\t\t\t Welcome to A2B");

                System.out.println("------------------------");

                System.out.println("\t\t\tYou are enter the A2B hotel");

                System.out.println("1.Idly");
                System.out.println("2.Dosai");
                System.out.println("3.Poorii");

                System.out.println("Which food do you want :");

                int menu = sc.nextInt();

                switch (menu) {

                    case 1 -> {

                        System.out.println("\t\t\tYou order Idly ");

                        int price = 15;

                        System.out.println("Enter the quantity of Idly : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);
                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } //Idly

                    case 2 -> {
                        System.out.println("\t\t\tYou order Dosai ");

                        int price = 20;

                        System.out.println("Enter the quantity of Dosai: ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } // Dosai

                    case 3 -> {
                        System.out.println("\t\t\tYou order Poorii ");

                        int price = 15;

                        System.out.println("Enter the quantity of Poorii : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } // Poorii
                }
            } //A2B

            case 3 -> {
                System.out.println("\t\t\t Welcome to Amma Canten");

                System.out.println("------------------------");

                System.out.println("You are enter the Amma Canteen");

                System.out.println("------------------------");

                System.out.println("1.Sambar Rice");
                System.out.println("2.Lemon rice");
                System.out.println("3.Tomato rice");

                System.out.println("Which food do you want :");

                int menu = sc.nextInt();

                switch (menu) {

                    case 1 -> {

                        System.out.println("\t\t\tYou order Sambar Rice ");

                        int price = 15;

                        System.out.println("Enter the quantity of Sambar Rice : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                              

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);
                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } //Sambar Rice

                    case 2 -> {
                        System.out.println("\t\t\tYou order Lemon rice ");

                        int price = 20;

                        System.out.println("Enter the quantity of Lemon rice: ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } // Lemon rice

                    case 3 -> {
                        System.out.println("\t\t\tYou order Tomato Rice ");

                        int price = 15;

                        System.out.println("Enter the quantity of Tomatoo rice : ");

                        int quantity = sc.nextInt();

                        int bill = price * quantity;

                        System.out.println("Your bill amount is :" + bill);

                        if (bill <= 500) {

                            System.out.println("Yes i want ");
                        } else {

                            System.out.println("No I dont want ");
                        }

                        System.out.println("1.G-pay\n2.Phone-pay ");

                        System.out.println("\t\t\tEnter the payment method :");

                        int payment_method = sc.nextInt();

                        switch (payment_method) {

                            case 1 -> {

                                System.out.println("You chose the payment method is Gpay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            }//G-pay

                            case 2 -> {
                                System.out.println("You chose the payment method is Phone-Pay .....");

                                System.out.println("We sent a otp on xxxxxxxxxx89 ");

                                 System.out.println("Processing ......");

                                Thread.sleep(3000);

                                 int your_otp = (int) (Math.random() * 9999 + 9999);

                                Thread.sleep(2000);

                                System.out.println("Your One Time Password is :" + your_otp);

                                System.out.println("Processing ......");

                                Thread.sleep(3000);

                                System.out.println("Please enter the OTP to continue the payment :");

                                int otp = sc.nextInt();

                                System.out.println(otp);

                                
                                if(otp==your_otp){

                                    System.out.println("You can continue to your payment ");
                                }
                                else{
                                    System.out.println("Otp is invalid ");
                                }

                            } // Phone-pay
                        }

                    } // Tomatoo rice

                }
            } //Amma Canteen
        }

    }
}
