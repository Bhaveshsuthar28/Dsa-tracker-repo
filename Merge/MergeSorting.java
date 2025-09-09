package Merge;

import java.util.Arrays;

public class MergeSorting {
    static int[] mergeSorting(int [] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSorting(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0 , j=0 , k=0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else if(first[i] > second[j]){
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
    public static void main(String[] args) {
        int[] Arr = {5,2,3,4,1,9};
        System.out.println("Before Sorting : " + Arrays.toString(Arr));

        int[] newArr = mergeSorting(Arr);
        System.out.println("After Sorting : " + Arrays.toString(newArr));
    }
}
