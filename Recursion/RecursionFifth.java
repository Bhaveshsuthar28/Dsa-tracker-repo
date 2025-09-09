package Recursion;

public class RecursionFifth {

    static int sumDigits(int n){
        if(n == 0) return n;
        
        return n%10 + sumDigits(n/10);
    }

    static int productDigits(int n){
        if(n%10 == n) return n;
        
        return n%10 * sumDigits(n/10);
    }

    static int sum = 0;
    static void reverseNumber(int n){
        if(n == 0) return;

        int rem = n%10;
        sum = sum*10 + rem;

        reverseNumber(n/10);
    }
    public static void main(String[] args) {
        int sumq = sumDigits(1234);
        System.out.println(sumq);
        System.out.println();
        int product = productDigits(123456);
        System.out.println(product);
        System.out.println();
        reverseNumber(123);
        System.out.println(sum);
        System.out.println();
    }
}
