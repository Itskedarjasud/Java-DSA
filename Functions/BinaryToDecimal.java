public class BinaryToDecimal { 
    public static int binToDecimal( int binNumber){
        int pow = 0;
        int dec = 0;
        while (binNumber > 0) {
            int lastDigit = binNumber % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNumber = binNumber / 10;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(binToDecimal(111));
    }
}
