import javax.sound.midi.Soundbank;

public class PrimeOrNotOptimized {
    public static boolean isPrime(int num){

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
                
            }
        }
        return isPrime; 
    }


    // Prime or not in optimize way
    public static boolean isPrimeOptimize(int num){
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
                
            }
        }
        return isPrime; 
    }


    // Print all prime numbers within the range 
    public static void primeNoRange(int num) {
        for (int i = 2; i < num; i++) {
            boolean a = isPrimeOptimize(i);
            if (a == true) {
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        // System.out.println(isPrime(12));
        // System.out.println(isPrimeOptimize(12));

        primeNoRange(100);

    }
}