package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void reverse(int[] arr){
        for(int i=0; i<=arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
