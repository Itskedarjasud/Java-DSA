package Arrays;

public class MaxSubarray_Sum {

    // Maximum Subarray Sum Using Brute Force 
    public static void MaxSubarray_Sum_BruteForce(int array[]){
        int max = Integer.MIN_VALUE;
        int maxSum = max;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= array.length; j++) {
                int currentSum = 0;
                for (int k = i; k < j; k++) {
                    currentSum += array[k]; 
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum is : " + maxSum);
    }



    // Maximum Subarray Sum Using Prifix Sum
    public static void MaxSubarray_Sum_PrifixSum(int array[]){
        int maxSum = Integer.MIN_VALUE;
        int PrifixSum[] = new int[array.length];
        PrifixSum[0] = array[0];
        // Calculate prifix
        for (int i = 1; i < PrifixSum.length; i++) {
            PrifixSum[i] = PrifixSum[i-1] + array[i];
        }
        for (int i = 0; i < PrifixSum.length; i++) {
            System.out.print(PrifixSum[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                if (i == 0) {
                   currentSum =  PrifixSum[j];
                }
                else{
                   currentSum =  PrifixSum[j] - PrifixSum[i - 1];
                }
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }
    
    
    
    //----------------------------------------------------------------------------------------------------------------------------------
    // the below code is to check all the values of array are negative or not 
    // public static void checkValues(int array[]){
    //     int numOfValue = array.length;
    //     int counter = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] < 0) {
    //             counter++;   
    //         } 
    //     }
    //     if (numOfValue == counter) {
    //         System.out.println("True");
    //     }
    //     else{
    //         System.out.println("false");
    //     }
    // }
    //----------------------------------------------------------------------------------------------------------------------------------

     
    // Maximum Subarray Sum Using Kadane's Algorithm
    public static void MaxSubarray_Sum_KadanesAlgo(int array[]){
 
        
        // checkValues(array);

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum = currentSum + array[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max Sum is " + maxSum);
    }
    
    public static void main(String[] args) {
        int array[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        // MaxSubarray_Sum_BruteForce(array);
        // MaxSubarray_Sum_PrifixSum(array);
        MaxSubarray_Sum_KadanesAlgo(array);
    }
}
