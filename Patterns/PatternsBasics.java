package Patterns;

// import java.util.Scanner;

public class PatternsBasics {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in)
        // int n = 4; 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        // for (int i = 4; i >= 1; i--) {
        //     for (int j = 1; j <= i ; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();    
        // }

        // for (int i = 1; i <= 4; i++) {
        //         for (int j = 1; j <= i ; j++) {
        //             System.out.print(j + " ");
        //         }
        //         System.out.println();    
        //     }

        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();    
        }
    }
}
