package projects;

import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {


        int pin = 1234;
        Scanner input = new Scanner(System.in);
        int amount = 1000;
        System.out.print("Enter your Pin: ");

        int password = input.nextInt();
        if(password == pin) {
        while(true){

            System.out.println(" 1. Deposit \n 2. withdraw \n 3. checkBalance \n 4. exit ");
            System.out.println("------------------------------------------------------------------");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("Enter the How much amount to deposit: ");
                    int balance = input.nextInt();
                    amount += balance;
                    System.out.println("Total Amount in you account: "+amount);

                } else if (choice == 2) {
                    System.out.println("your balance :"+amount);
                    System.out.print("Enter the WithDraw Amount: ");
                    int withDraw_amount = input.nextInt();
                    amount -= withDraw_amount;
                    System.out.println("Total Amount in your account :" +amount);

                }else if(choice == 3){
                    System.out.println("Your current balance: "+amount);

                }else if(choice == 4
                ){
                    System.out.println("Exited ATM.....");
                    break;
                }

            }

    }else {
            System.out.println("Incorrect password.");
        }
    }






}
