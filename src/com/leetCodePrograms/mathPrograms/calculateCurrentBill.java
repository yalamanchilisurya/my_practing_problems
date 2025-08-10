package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;
//calculate the current bill
public class calculateCurrentBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Unites: ");
        int units = input.nextInt();
        double total = calculateBill(units);
        System.out.println("Total Electrical Bill Rs. "+String.format("%.2s", total));
    }

    static double calculateBill(int units) {
        double billAmount = 0;
        if(units <= 50)
            billAmount = units * 3.0; // rate for 50 units;
        else if(units <=  200){
            billAmount = (50 * 3.0) + ((units - 50 ) * 4.8); //Rate for 150 units.
        } else if (units <= 400) {
            billAmount = (50 * 3.0) + (150 * 4.8) +((units - 200 ) * 5.8); // Rate for 200 units
        }else
            billAmount = (50 * 3.0) + (150 * 4.8) + (200 * 5.8) + ((units - 400) * 6.8); // Rate above 400 uits
        return billAmount;
    }
}
