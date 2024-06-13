public class FunctionsBasics {

    // First Function
    public static void PrintHelloWord(){
        System.out.println("Hello Word");
    }


    // function which calculate sume of two numbers
    public static int calculateSum( int num1, int num2) // Formal Parameters or Parameters
    {
        int sum = num1 + num2;
        return sum;
    }


    // Function to find Product of Two numbers
    public static int calculateProd(int num1, int num2){
        int prod = num1 * num2;
        System.out.println(prod);
        return prod;
    }

    // Function for factorial n 
    public static int factorial(int num){
        int fact  = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Binomial Coefficient  ==> nCr = n!/r!(n-r)!
    public static int BinomialCoeff(int n, int r){
        int nfact =  factorial(n);
        int rfact =  factorial(r);
        int nrfact = factorial( n - r);

        // formula 
        int coeff = (nfact / (rfact * nrfact));
        return coeff;
    }
    
    public static void main(String[] args) {
        // PrintHelloWord();

        // calculateSum(5, 6); //Actual Param or arguments 
        
        // int a = 5;
        // int b = 10;
        // calculateProd(a, b);

        // int num = 0;
        // int fact = factorial(num);
        // System.out.println(fact);

        System.out.println(BinomialCoeff(5, 2));
    }
    
    
} 