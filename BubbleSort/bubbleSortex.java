package BubbleSort;

import java.util.Arrays;

public class bubbleSortex {
    static void bubbleSort(int[] arr){
        int n = arr.length -1;
        int swaped = 0 , pass = 0;

        for(int i=0; i<n; i++){
            pass++;
            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Total Swaping  = " + swaped + "\nTotal Passing  = " + pass);

        System.out.println("Final Sorted Arrays : " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5,1,4,6,9,5,2,0};
        
        bubbleSort(arr);        
    }
}
