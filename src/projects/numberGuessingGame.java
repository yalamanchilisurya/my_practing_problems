package projects;


import java.util.*;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int n = random.nextInt(1,100);
        int attempts = 10;
        while(attempts > 0){
            System.out.print("Enter the Guess Number: ");
            int guess = input.nextInt();
            if(guess > n){
                System.out.println("Your Number is Too High.");
            }  else if (guess < n) {
                System.out.println("Your Number is Too Low.");
            }else {
                System.out.println("Congrats you won the .");
                break;
            }

            attempts -= 1;
            System.out.println(attempts+ " Attempts  left.");
        }
        if(attempts == 0){
            System.out.println("Your attempts done better luck next Time!.");
        }
    }
}