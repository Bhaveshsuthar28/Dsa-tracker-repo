package BInarySearch;

public class BinarySearch1 {

    static int Binary_Search(int[] arr , int target){
        int start = 0 , end = arr.length-1;

        while(start <=end){
            int mid = (start + end)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    static int Binary_Search_D(int[] arr , int target){
        int start = 0 , end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] > target){
                start = mid + 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int result = Binary_Search(arr,5);

        if(result == -1){
            System.out.println("Not exist");
        }
        else{
            System.out.println("found at " + result);
        }

        int[] arr2 = {100,99,98,97,44,32,11};

        int result2 = Binary_Search_D(arr2,32);

        if(result2 == -1){
            System.out.println("Not exist");
        }
        else{
            System.out.println("found at " + result2);
        }
    } 
}
