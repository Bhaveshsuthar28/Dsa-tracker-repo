package Array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(maximum(arr));
        sc.close();
    }

    static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
