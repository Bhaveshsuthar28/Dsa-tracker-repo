package Recursion;

public class RecursionSecond {
    static int fibonaci(int n){
        if(n < 2){
            return n;
        }
        else{
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
    public static void main(String[] args) {
        for(int i=0 ; i<10; i++){
            System.out.println(fibonaci(i));
        }
    }
}
