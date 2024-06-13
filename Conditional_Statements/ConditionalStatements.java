package Conditional_Statements;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        // Larger number between two numbers
        Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // if (A > B) {
        //     System.out.println("A ia Big");
        // }
        // else{
        //     System.out.println("B is Big");
        // }

        // Print if Number is odd or even 
        // int number = sc.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println(number + " is Even number  ");
        // }
        // else{
        //     System.out.println(number + " is Odd number  ");
        // }

        // Income Tax Calculator 
        // float income = sc.nextFloat();
        // if (income < 500000) {
        //     System.out.println("You do not have to pay any Tax as your income is " + income);
        // }
        // else if (income >= 500000 && income < 1000000) {
        //     System.out.println("You have to pay 20% tax on your income");
        //     float tax = (income / 100 ) * 20;
        //     System.out.println("You have to pay Rs" + tax + " tax as your incoome is Rs" + income);
        // }
        // else{
        //     System.out.println("You have to pay 30% tax on your income");
        //     float tax = (income / 100 ) * 30;
        //     System.out.println("You have to pay Rs" + tax + " tax as your incoome is Rs" + income);
        // }

        // ternery operator 
        // int num = 7;
        // String type = (num % 2 == 0) ? "Even" : "Odd" ;
        // System.out.println(type);

        // Student is Pass or Fail using ternery operator
        int number = sc.nextInt();
        String status = (number >= 33) ? "Pass" : "Fail" ;
        System.out.println(status);
    }
}
