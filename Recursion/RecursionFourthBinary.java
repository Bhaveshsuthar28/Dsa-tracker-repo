package Recursion;

public class RecursionFourthBinary {
    static int BinarySearch(int[] arr , int start , int end , int target){

        if(start > end) return -1;

        int mid = start + (end - start)/2;

        if(arr[mid] == target) return mid;

        if(arr[mid] > target) return BinarySearch(arr, start, mid-1, target);

        return BinarySearch(arr, mid+1, end, target);
    }
    public static void main(String[] args) {
        int[] arr = {11,13,15,17,18};

        System.out.println(BinarySearch(arr, 0, arr.length-1, 18));
    }
}
