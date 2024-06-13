package Loops;

import java.util.Scanner;

public class PracticsSet {
    public static void main(String[] args) {
        // Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter How many numbers you want to add:- ");
        // int count = sc.nextInt();
        // int even = 0, odd = 0;
        // for (int i = 1; i <= count; i++) {
        //     System.out.println("Enter the num " + i );
        //     int num = sc.nextInt();
        //     if (num % 2 == 0) {
        //         even = even + num;
        //     }
        //     else{
        //         odd = odd + num;
        //     }
        // }
        // System.out.println("Sum of even numbers is : " + even);
        // System.err.println("Sum of odd numbers is : " + odd);

        

        // Write a program to find the factorial of any number entered by the user
        // int num = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= num ; i++) {
        //     fact *= i;
        // }
        // System.out.println(fact);


        // Prime Number 
        int num = sc.nextInt();
        int div = 2;
        boolean isPrime = true;
        while(div < num / 2){
            if (num % div == 0) {
                isPrime = false;
                break;
            }
            else{
                div = div + 1;
            }
        }
        if (isPrime == false) {
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Number is Prime!");
        }
    }
}
