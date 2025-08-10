package com.leetCodePrograms.mathPrograms;

import java.util.Scanner;

//Discount Amount = Original Price * (Discount Percentage / 100)
//Discounted Price = Original Price - Discount Amount
public class discountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of a product: ");
        int price = input.nextInt();
        System.out.print("Enter the discount of a product: ");
        int discount = input.nextInt();

        double discount_amount = price * ((double) discount / 100);
        double total = price - discount_amount;
        System.out.println("Total amount of a product: "+total);
    }
}
