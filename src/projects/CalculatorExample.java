package projects;

import java.util.Scanner;
class Calculator{
    public int add(int a , int b){
        return a + b;
    }
    public int Sub(int a , int b){
        return a - b;
    }
    public double Mult(int a , int b){
            return  a * b;
    }
    public double Div(int a , int b){
        if(b == 0)
            System.out.println("Not Divisible By zero(0)");
        else
            return (double) a /b;
        return 0;
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        int choice , x ,y;
        while (true){
            System.out.println("Enter the Choice:");
            System.out.println("1.Addition \n 2.Substraction \n 3. Multiplication \n 4 .Division \n 5 .Exit.");
            choice = sc.nextInt();
            if(choice == 5){
                System.out.println("Exited.....");
                break;
            }
            System.out.print("Enter the a and b vales: ");
            x = sc.nextInt();
            y = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Addition of a and b values = " + (Cal.add(x, y)));
                case 2 -> System.out.println("Substration of a and b values = " + (Cal.Sub(x, y)));
                case 3 -> System.out.println("Multiplication of a and b values = " + (Cal.Mult(x, y)));
                case 4 -> System.out.println("Division of a and b values = " + (Cal.Div(x, y)));
                default -> System.out.println("Invalid choice !");
            }

        }
        sc.close();
    }
}
