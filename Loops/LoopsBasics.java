package Loops;

import java.util.Scanner;

public class LoopsBasics {
    public static void main(String[] args) {
        // while loop 
        // print table of any number 
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(num + " * " + counter + " = " + num * counter);
        //     counter++;
        // } 

        // Print number 1 to 10
        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
        // }

        // Sum of first n natural numbers 
        // int num = sc.nextInt();
        // int counter = 1;
        // int sum = 0;
        // while (counter <= num) {
        //     if (counter == num) {
        //         System.out.print(counter + " ");
        //     }
        //     else{
        //         System.out.print(counter + " + ");
        //     }
        //     sum += counter;
        //     counter++;
        // }
        // System.out.println(" = " + sum);


        // For Loop 
        // for(int i = 1; i <= 10; i++){
        //     System.out.println("hello");
        // }

        // Reverse of a number 
        // int num = sc.nextInt();
        // int lastDigit;
        // while (num > 0) {
        //     lastDigit = num % 10;
        //     num = num / 10;
        //     System.out.print(lastDigit);
        // }

        // reverse of number in single veriable
        int num = sc.nextInt();
        int lastDigit;
        int reverse = 0;
        while (num > 0) {
            lastDigit = num % 10 ;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10 ;
        }

        System.out.println(reverse);
    }
}
