package Arrays;
// import java.util.*;

import java.util.Scanner;

public class ArraysBasics {
    // Array Passes Call By Refference Values
    // public static void update(int marks[], int num){
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    //     num = num +1;
    // }



    // Linear Search 
    // public static int LinearSearch(String array[], String Key){
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] == Key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }



    // Largest-Smallest values
    // public static void LargestSmallest(int array[]){
    //     int Largest = Integer.MIN_VALUE;
    //     int Smallest = Integer.MAX_VALUE;
    //     for (int i = 0; i < array.length; i++) {
    //         if (Largest < array[i]) {
    //             Largest = array[i];
    //         }
    //     }
    //     for (int i = 0; i < array.length; i++) {
    //         if (Smallest > array[i]) {
    //             Smallest = array[i];
    //         }
    //     }
    //     System.out.println("Largest value from array is " + Largest);
    //     System.out.println("Smallest value from array is " + Smallest);
    // }



    // Binary Search 
    // public static int BinarySearch(int array[], int key){
    //     int start = 0; 
    //     int end = array.length-1;
    //     int loc = -1;
    //     while (start <= end) {
    //         int mid = (start + end)/2;
    //         if (array[mid] == key) {
    //             loc = mid;
    //             return loc;
    //         }
    //         else{
    //             if (array[mid] >= key) {
    //                 end = end-1;
    //             }
    //             else{
    //                 start = start+1;
    //             }
    //         }
    //     }
    //    return loc; 
    // }



    // Reverse of an array 
    // public static void ReverseArray(int array[]){
    //     int start = 0;
    //     int end = array.length-1;
    //     while (start < end) {
    //         int temp = array[end];
    //         array[end] = array[start];
    //         array[start] = temp;
    //         start++;
    //         end--;
    //     }
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    // }



    // Pairs of an array
    // public static void arrayPairs(int array[]){
    //     for (int i = 0; i < array.length; i++) {
    //         for (int j = i; j < array.length; j++) {
    //             if (array[i] != array[j]) {
    //                 System.out.print("( " + array[i] + "," + array[j] + ")");
    //             }
    //         }
    //     }
    // }



    // Subarray within the array 
    public static void Subarray(int array[]){
       int lowest = Integer.MAX_VALUE;
       int highest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;           
            for (int j = start; j < array.length+1; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k < end; k++) {
                    System.out.print(array[k] + "  ");
                    sum = sum + array[k];
                }
                System.out.print(": ");
                System.out.print(sum);
                if (sum >= highest ) {
                    highest = sum;
                }
                if (sum < lowest) {
                    lowest = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The lowest sum is : "  + lowest);
        System.out.println("The highest sum is : "  + highest);

    }



    public static void main(String[] args) {
        // Array Passes Call By Refference Values
        // int marks[] = {93, 94, 95, 96, 97};
        // int num = 5;
        // update(marks, num);
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();
        // System.out.println(num);



        // Linear Search
        // String array[] = {"Apple", "Orange", "Mango", "Lichy"};
        // String Key = "Mango";
        // int index = LinearSearch(array, Key);
        // if (index == -1) {
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("Key found at index " + index);
        // }



        // Largest-Smallest Values
        // int array[] = {1,2,3,4,5,6,7,8,9,10};
        // LargestSmallest(array);



        // Binary Search 
        // int array[] = {1,2,3,4,5,6,7,8,9,10};
        // int key = 6;
        // int index = BinarySearch(array, key);
        // if (index == -1) {
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("element found at index " + index);
        // }
        


        // Reverse of an Array
        // int array[] = {2,4,6,8,10};
        // ReverseArray(array);



        //input in array
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of an array: ");
        // int size =sc.nextInt() ;
        // int array[] = new int[size];
        // for (int i = 1; i <= size; i++) {
        //     System.out.print("Enter element " + i + ": ");
        //     array[i] = sc.nextInt();
        // }
        // for (int i = 1; i <= size; i++) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println();



        // int array[] = {2,4,6,8,10};
        // arrayPairs(array);



        // SubArrays within the array
        int array[] = {5,8,6,7,2,4};
        Subarray(array);
    }

}
