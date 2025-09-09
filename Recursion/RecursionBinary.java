package Recursion;

public class RecursionBinary {
    static int binary(int[] arr , int target , int start , int end){
        if(start > end) return -1;

        int mid = start + (end - start)/2;

        if(arr[mid] == target) return mid;

        if(arr[mid] > arr[mid+1]) return binary(arr, target, mid+1, end);

        return binary(arr, target, start, mid-1);
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,1,2,3,4,5};

        int result = binary(arr, 3 , 0 , arr.length-1);

        System.out.println(result);
    }
}