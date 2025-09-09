package Recursion;

public class RecursionFirst {
    static long factorial(long n){
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        long n = 20;
        System.out.println(factorial(n));
    }
}
