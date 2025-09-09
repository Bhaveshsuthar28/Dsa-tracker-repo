package Merge;

import java.util.Arrays;

public class MergeInplace {

    static int[] finalSorting(int[] arr){
        mergeSorting(arr, 0, arr.length);
        return arr;
    }

    static void mergeSorting(int[] arr, int start , int end){
        if((end - start) == 1) return;
        
        int mid = (end + start)/2;

        mergeSorting(arr, start, mid); // divide into left path
        mergeSorting(arr, mid, end); // divide into right part 

        inPlace(arr, start, mid, end); // merging both havles 
    }

    static void inPlace(int[] arr , int start , int mid , int end){
        int[] mix = new int[end-start];

        int i = start , j = mid , k = 0;

        while( i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++; 
            }
            else if(arr[i] > arr[j]){
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while( j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length ; l++){
            arr[start+l] = mix[l];
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,3,1};
        int[] sort = finalSorting(arr);

        System.out.println(Arrays.toString(sort));
    }
}
