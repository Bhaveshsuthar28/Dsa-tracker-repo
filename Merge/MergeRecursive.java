package Merge;

import java.util.Arrays;

public class MergeRecursive {
    static int[] mergerSort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergerSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left , right);
    }

    static int[] merge(int[] left , int[] right){
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else if(left[i] > right[j]){
                mix[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        
        return mix;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,62,3,42,13,43};
        System.out.println("Before Sorting : " + Arrays.toString(arr));

        int[] merge = mergerSort(arr);
        System.out.println("After Sorting : "+ Arrays.toString(merge));
    }
}
