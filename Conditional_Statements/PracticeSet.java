package Conditional_Statements;

import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        //  Write a Java program to get a number from the user and print whether it is positive or negative
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num > 0){
        //     System.out.println("Number is Positive ");
        // }
        // else{
        //     System.out.println("Number is Negative");
        // }

        // Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
        // double temp = 103.5;
        // if (temp >= 100) {
        //     System.out.println("You have a Fever");
        // }
        // else{
        //     System.out.println("You did not have a fever");
        // }


        // Write a Java program to input week number(1-7) and print day of week name using switch case
        // int num = sc.nextInt(); 
        // switch (num) {
        //     case 1:
        //             System.out.println("Sunday");
        //         break;

        //     case 2:
        //         System.out.println("Monday");
        //         break;

        //     case 3:
        //             System.out.println("Tuesday");
        //         break;

        //     case 4:
        //         System.out.println("Wednesday");
        //         break;

        //     case 5:
        //         System.out.println("Thersday");
        //         break;
                
        //     case 6:
        //             System.out.println("Friday");
        //         break;

        //     case 7:
        //         System.out.println("Saturday");
        //         break;

        //     default:
        //         System.out.println("You entered ");
        //         break;
        // }


        // Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Year is Leap Year");
                }
                else{
                    System.out.println("Not a Leap year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    
}