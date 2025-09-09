package cyclicSort;

import java.util.Arrays;

public class first {
    static void sort(int[] arr){
        int i=0;

        while(i < arr.length){
            int correct = arr[i] - 1;
            
            if(arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,12,11};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
