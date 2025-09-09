package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    static void swap(int index1 , int index2 , int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }

        swap(2, 1, arr);
        System.out.println(Arrays.toString(arr));
        
        sc.close();
    }
}
