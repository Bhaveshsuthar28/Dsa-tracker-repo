package selectionAndInsertionSort;

import java.util.Arrays;

public class SelectionSort1 {
    static void selection(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int last = n - i -1;
            int maxindex = GetMaxIndex(arr , 0 , last);

            swap(arr, maxindex , last);
            System.out.println(Arrays.toString(arr));
        }
    }

    static void Insertion(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,(j-1));
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int GetMaxIndex(int[] arr , int start , int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3,5};

        selection(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] array = {5,3,4,1,8};

        Insertion(array);

        System.out.println(Arrays.toString(array));
    }
}
